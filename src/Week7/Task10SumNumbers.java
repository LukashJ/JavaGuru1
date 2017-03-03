package Week7;

import java.util.Scanner;

public class Task10SumNumbers {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please Enter number");
        int userNumber = scanner.nextInt();
        System.out.println ("Sum digits number: " + sumDigitNumber(userNumber));
    }

    private static int sumDigitNumber (int userNumber) {
        int sumDigit = 0;
            while (userNumber>0) {
                sumDigit = sumDigit + userNumber%10;
                userNumber = (int) (userNumber/10);
            }
        return sumDigit;
    }

}
