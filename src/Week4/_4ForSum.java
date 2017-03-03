package Week4;


import java.util.Scanner;

public class _4ForSum {

    public static void main(String[] args) {
       int minNumber;
       int maxNumber;
       int numberSum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Number1");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your Number2");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            minNumber = number2;
            maxNumber = number1;
        }
        else {
            minNumber = number1;
            maxNumber = number2;
        }

         for (int i = minNumber; i <= maxNumber; i++) {
             numberSum = numberSum+minNumber;
             minNumber = minNumber+1;
         }
        System.out.println("Sum of range: " + numberSum);
    }
}
//Вычисляю сумму в диапазоне вне зависимости больше или меньше 1-ое число 2-го