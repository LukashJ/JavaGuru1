package Week4;

import java.util.Scanner;


public class _4ForSum2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Number1");
        int number1 = scanner.nextInt();
        System.out.println("Please enter your Number2");
        int number2 = scanner.nextInt();

            int numberSum = (number1+number2)*(Math.abs(number1-number2)+1)/2;

        System.out.println("Sum of range: " + numberSum);
    }
}

// Через формулу суммы для арифметической последовательности
// Как никак физьмат закончил
// Кто больше кто меньше опять не учитываю, просто считаю сумму в диапазоне
// Если важно считать только когда 1-oe число меньше 2-го, то надо добавить еще один IF.