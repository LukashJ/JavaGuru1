package Week5;


import java.util.Scanner;

public class _2WhileNumber1Number2 {

    public static void main(String[] args) {
        int minNumber;
        int maxNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Number1");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your Number2");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            minNumber = number2;
            maxNumber = number1;
        } else {
            minNumber = number1;
            maxNumber = number2;
        }
        int i = minNumber;
        while (i <= maxNumber) {
            System.out.println(i);
            i++;
        }
    }
}
