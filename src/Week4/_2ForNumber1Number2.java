package Week4;


import java.util.Scanner;

public class _2ForNumber1Number2 {


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
        }
        else {
           minNumber = number1;
           maxNumber = number2;
        }

        for (int i=minNumber; i <= maxNumber; i++) {
            System.out.println(i);
        }
    }
}
// Расширил задание, не только вывожу от 1-го до 2-го, если 1-oe меньше 2-го, а выясняю, кто из них меньше и
// тогда вывожу диапазон между ними.
// В случае равенства 1-го и 2-го, то как понял надо выводить само число,
// если не так, то надо немного переделать.