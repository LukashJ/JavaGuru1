package Week3;


import java.util.Scanner;

public class _1PositiveNegative {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Your number is " + number);
        } else  if (number < 0) {
            System.out.println("Your number is negative");
        }else {
            System.out.println("Your number is positive");
        }
    }
}