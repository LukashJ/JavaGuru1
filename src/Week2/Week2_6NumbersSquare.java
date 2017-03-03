package Week2;


import java.util.Scanner;

public class Week2_6NumbersSquare {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();
        System.out.println("Square your number is " + Math.pow(number,2));
    }
}
