public class Task4 {

    // Task 4A: Print elements of linked list in reverse order using recursion
    public static void task4A_recursive(Node head) {
        if (head!=null) {
          task4A_recursive(head.next);
          System.out.print(head.elem + " ");}
    }

    // Task 4B: Reverse linked list recursively and return new head
    public static Node task4B_recursive(Node head) {
      Node nhead = lastnode(head, null);
      reverse(head, nhead);
      return nhead;
    }
    public static Node lastnode(Node head, Node target) {
      if (head.next != target) {
        head = lastnode(head.next, target);}
      return head;
    }
    public static void reverse(Node head, Node nhead) {
      Node n = head;
      if ( n.next != nhead) {
        n = lastnode(head, nhead);}
      if (n != head) {
        reverse(head, n);}
      else if (n == head) {
        n.next = null;}
      nhead.next = n;
    }

    
    public static void main(String[] args) {
        // Driver code for testing Task 4 methods
        System.out.println("------------------------------");

        Node head = arr2LL( new int[]{23,5,3,11,7,6} );
        System.out.println("\n Task4A ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: 6 -> 7 -> 11 -> 3 -> 5 -> 23 ->");
        System.out.println("Your Output: ");
        task4A_recursive(head);

        System.out.println("\n Task4B ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: 6 -> 7 -> 11 -> 3 -> 5 -> 23 ->");
        System.out.println("Your Output: ");
        Node rvHead = task4B_recursive(head);
        showLL(rvHead);

        System.out.println("------------------------------");


    }

    // Helper method to show the list (for driver code)
    public static void showLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node arr2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            n.next = newNode;
            n = newNode;
        }
        return head;
    }
}
