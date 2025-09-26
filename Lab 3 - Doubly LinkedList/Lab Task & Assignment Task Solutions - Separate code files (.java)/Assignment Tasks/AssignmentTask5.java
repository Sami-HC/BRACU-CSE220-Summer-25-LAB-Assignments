public class AssignmentTask5 {
  //
  //
  //
  //
  //------Assignment-Task-05--------------------------
    public static void sumOddAppend(Node dh) {
      
      Node n = dh.next;
      Node prev = dh;
      int sum = 0;
      
      while (n != dh) {
        if ((int)n.elem % 2 != 0) {
          prev.next = n.next;
          sum += (int)n.elem;}
        prev = n;
        n = n.next;}
      
      Node sumnode = new Node (sum);
      sumnode.next = dh;
      prev.next = sumnode;
      
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
