import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
      for (int i = 1; i<11; i++) {
        System.out.println(i);}
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {
      if (i<11) {
        System.out.println(i);
        task1B_recursive(i+1);}
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
       for (int i = 1; i<=n; i++) {
        System.out.println(i);}
    }

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
       if (i<=n) {
        System.out.println(i);
        task1D_recursive(i+1, n);}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Print numbers from 1 to 10 using a loop :");
        task1A();
        System.out.println("\n \n \nPrint numbers from 1 to 10 using recursion :");
        task1B_recursive(1);
        System.out.println("\n \n \nEnter a random integer: ");
        int n = sc.nextInt();
        System.out.println("\n \n \nPrint numbers from 1 to "+n+" using a loop :");
        task1C(n);
        System.out.println("\n \n \nPrint numbers from 1 to "+n+" using recursion :");
        task1D_recursive(1, n);

        sc.close();
    }
}
