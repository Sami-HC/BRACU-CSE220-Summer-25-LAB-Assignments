public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient last = dh.prev;
        Patient newpatient = new Patient (id, name, age, bloodgroup, null, null);
        last.next = newpatient;
        newpatient.prev = last;
        newpatient.next = dh;
        dh.prev = newpatient;
    }

    public void servePatient() {
      if (dh.next == dh) {
        System.out.println("No patient in the waiting room");}
      else if (dh.next.next == dh) {
        dh.next = dh;
        dh.prev = dh;}
      else {
        dh.next = dh.next.next;
        dh.next.prev = dh;}
    }

    public void showAllPatient() {
      if (dh.next == dh) {
        System.out.println("No patient in the waiting room");}
      else {
        Patient n = dh.next;
        while (n.next != dh) {
          System.out.println(n.id);
          n = n.next;}
        System.out.println(n.id);}
    }

    public Boolean canDoctorGoHome() {
      boolean check = false;
      if (dh.next == dh) {
      check = true;}
      return check;
    }

    public void cancelAll() {
        dh.next = dh;
        dh.prev = dh;
    }


    public void reverseTheLine() {
        Patient last = dh.prev;
        Patient first = dh.next;
        Patient n = first;
        while (n != dh) {
          Patient temp = null;
          temp = n.prev;
          n.prev = n.next;
          n.next = temp;
          n = n.prev;}
        dh.next = last;
        dh.prev = first;
        last.prev = dh;
        first.next = dh;
    }

}