public class AssignmentTask6 {
  //
  //
  //
  //
  //------Assignment-Task-06--------------------------
    public static void pairJoin(DNode dh1, DNode dh2) {
      
      DNode a = dh1.next.next;
      DNode atemp = a.prev;
      DNode b = dh2.next.next;
      DNode btemp = b.prev;
      
      while (a.next != null) {
        atemp.next = btemp;
        btemp.next = a;
        a.prev = btemp;
        btemp.prev = atemp;
        a = a.next;
        b = b.next;
        atemp = a.prev;
        btemp = b.prev;}
      
      atemp.next = btemp;
      btemp.next = a;
      a.prev = btemp;
      btemp.prev = atemp;
      a.next = b;
      b.prev = a;
      b.next = dh1;
      dh1.prev = b;
      
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
