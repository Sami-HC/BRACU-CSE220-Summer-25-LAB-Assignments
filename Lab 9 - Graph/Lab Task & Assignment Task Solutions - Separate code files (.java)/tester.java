import java.util.Arrays;
public class tester {
  public static void main (String [] args) {
    
    String [] vertex = {"A","B","C","D","E","F","G","H","I","J"};
    
    System.out.println("-----------Task0a-----------\n");
    task.task0a(directed_graph_unweighted.getadjmat(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task0b-----------\n");
    task.task0b(directed_graph_unweighted.getadjlist(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task1a-----------\n");
    System.out.println("Graph: ");
    task.task0a(undirected_graph_unweighted.getadjmat(), vertex);
    int check1a = task.task1a(undirected_graph_unweighted.getadjmat());
    if (check1a == 5) {
      System.out.println("Task1a successfully done. Answer = 5");}
    else {
      System.out.println("Task1a failed. Correct Answer = 5. Returned = "+check1a);}
    System.out.println("\n\n");
    
    System.out.println("-----------Task1b-----------\n");
    System.out.println("Graph: ");
    task.task0b(undirected_graph_unweighted.getadjlist(), vertex);
    int check1b = task.task1b(undirected_graph_unweighted.getadjlist());
    if (check1b == 5) {
      System.out.println("Task1b successfully done. Answer = 5");}
    else {
      System.out.println("Task1b failed. Correct Answer = 5. Returned = "+check1b);}
    System.out.println("\n\n");
    
    System.out.println("-----------Task2a-----------\n");
    System.out.println("Graph: ");
    task.task0a(undirected_graph_weighted.getadjmat(), vertex);
    task.task2a(undirected_graph_weighted.getadjmat(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task2b-----------\n");
    System.out.println("Graph: ");
    task.task0b(undirected_graph_weighted.getadjlist(), vertex);
    task.task2b(undirected_graph_weighted.getadjlist(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task3a1-----------\n");
    System.out.println("Graph: ");
    task.task0a(directed_graph_weighted.getadjmat(), vertex);
    int check3a1 = task.task3a1(directed_graph_weighted.getadjmat());
    if (check3a1 == 3) {
      System.out.println("Task3a1 successfully done. Answer = 3");}
    else {
      System.out.println("Task3a1 failed. Correct Answer = 3. Returned = "+check3a1);}
    System.out.println("\n\n");
    
    System.out.println("-----------Task3a2-----------\n");
    System.out.println("Graph: ");
    task.task0a(directed_graph_weighted.getadjmat(), vertex);
    task.task3a2(directed_graph_weighted.getadjmat(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task3b1-----------\n");
    System.out.println("Graph: ");
    task.task0b(directed_graph_weighted.getadjlist(), vertex);
    int check3b1 = task.task3b1(directed_graph_weighted.getadjlist());
    if (check3b1 == 3) {
      System.out.println("Task3b1 successfully done. Answer = 3");}
    else {
      System.out.println("Task3b1 failed. Correct Answer = 3. Returned = "+check3b1);}
    System.out.println("\n\n");
    
    System.out.println("-----------Task3b2-----------\n");
    System.out.println("Graph: ");
    task.task0b(directed_graph_weighted.getadjlist(), vertex);
    task.task3b2(directed_graph_weighted.getadjlist(), vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task4a-----------\n");
    System.out.println("Graph: ");
    task.task0a(directed_graph_weighted.getadjmat(), vertex);
    int [] [] a = undirected_graph_weighted.getadjmat();
    int [] [] b = task.task4a(directed_graph_weighted.getadjmat());
    if (Arrays.deepEquals(a, b)) {
      System.out.println("Task4a successfully done.");}
    else {
      System.out.println("Task4a failed.");}
    System.out.println("Returned graph: ");
    task.task0a(b, vertex);
    System.out.println("\n\n");
    
    System.out.println("-----------Task4b-----------\n");
    System.out.println("Graph: ");
    task.task0b(directed_graph_weighted.getadjlist(), vertex);
    edge [] aa = undirected_graph_weighted.getadjlist();
    edge [] bb = task.task4b(directed_graph_weighted.getadjlist());
    System.out.println("\nReturned graph: ");
    task.task0b(bb, vertex);
    System.out.println("\nExpected graph: ");
    task.task0b(aa, vertex);
    System.out.println("\n\n");
  }
}