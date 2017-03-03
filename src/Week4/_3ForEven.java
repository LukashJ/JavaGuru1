package Week4;

import java.util.Scanner;


public class _3ForEven {
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

        for (int i = minNumber; i <= maxNumber; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);


            }
        }

    }
}