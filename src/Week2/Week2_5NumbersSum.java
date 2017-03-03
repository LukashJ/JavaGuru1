package Week2;

import java.util.Scanner;


public class Week2_5NumbersSum {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your number2: ");
        int number2 = scanner.nextInt();
        int numberSum = number1+number2;
        System.out.println("Sum your numbers is " + numberSum);
// Тут вопрос, когда эту строку писал System.out.println("Sum your numbers is " + number1+number2), то при вводе 1 и 2
// результат был 12, вместо 3. Я понимаю, что он тогда их складывает как текст, но почему?
    }
}
