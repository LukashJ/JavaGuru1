package Week7;


import java.util.Scanner;

public class Task9FiboN {

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Please Enter Fibonacci N:");
        int numberN = scanner.nextInt();
        System.out.println ("Number Fibonacci is: " + numbersFibonacci(numberN));
    }

    private static int numbersFibonacci (int n) {
        int nFibonacci0 = 0;
        int nFibonacci1 = 1;
        int nFibonacciLast = 1;
        if (n == 0)
            return nFibonacci0;
        for (int i = 1; i < n; i++) {
                nFibonacciLast = nFibonacci0 + nFibonacci1;
                nFibonacci0 = nFibonacci1;
                nFibonacci1 = nFibonacciLast;
            }
        return nFibonacciLast;
    }
}
