import java.util.Arrays;
public class HeapTester {
  public static void main (String [] args) {
    
    System.out.println("---------------Testing TASK-3---------------");
    int [] tasks = {2, 4, 7, 1, 6};
    int m = 4;
    int [] expoutput3 = {2, 4, 7, 7};
    int [] task3output = test.task3(tasks, m);
    if (Arrays.equals(expoutput3, task3output)) {
      System.out.println("Congratulations! TASK-3 completed successfully, outputs matched");}
    else {
      System.out.println("TASK-3 failed, outputs did not match");}
    System.out.println("TASK-3 expected output: "+Arrays.toString(expoutput3));
    System.out.println("TASK-3 output after test: "+Arrays.toString(task3output));
    
    
    System.out.println("---------------Testing TASK-4---------------");
    int [] nums = {4, 10, 2, 8, 6, 7};
    int k = 3;
    int [] expoutput4 = {10, 8, 7};
    int [] task4output = test.task4(nums, k);
    if (Arrays.equals(expoutput4, task4output)) {
      System.out.println("Congratulations! TASK-4 completed successfully, outputs matched");}
    else {
      System.out.println("TASK-4 failed, outputs did not match");}
    System.out.println("TASK-4 expected output: "+Arrays.toString(expoutput4));
    System.out.println("TASK-4 output after test: "+Arrays.toString(task4output));
    
  }
}