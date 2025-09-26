// LabTask2: Word Decoder
public class LabTask2 {
    
    // Must Submit this method
    // After you're done coding submit only this method
    public static Node wordDecoder( Node head ){
        
        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        //remove the following line when you're ready to return the new head
      
      Node dh = new Node (null,null);
      Node bn = dh;
      
      Node n = head;
      int length = 0;
      while (n!=null) {
        length += 1;
        n = n.next;}
      
      int target = 13%length;
      
      int i = 0;
      Node c = head;
      while (c!=null) {
        if (i!=0 && i%target==0) {
          Node temp = new Node (c.elem,null);
          bn.next = temp;
          bn = temp;}
        c = c.next;
        i += 1;}
      
      Node prev = null;
      Node current = dh.next;
      Node next = null;
      while (current.next!=null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;}
      current.next = prev;
      dh.next = current;
      
      
        return dh;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
