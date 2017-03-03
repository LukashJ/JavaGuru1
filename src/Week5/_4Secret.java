package Week5;

import java.util.Random;
import java.util.Scanner;

public class _4Secret {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, загадайте число от 1 до 100");
         Random randomGenerator = new Random();
          int pcNumber = randomGenerator.nextInt(100);

        int userNumber = 2;
        int userNumberMin = 1;
        int userNumberMax = 100;

        Scanner scanner = new Scanner(System.in);

        while (!(userNumber == 0)) {
            System.out.println("Ваше число:" + pcNumber + "?");
            System.out.println("Введите: 0, если компьютер угадал;");
            System.out.println("        -1, если Ваше число меньше");
            System.out.println("         1, если Ваше число больше");
             userNumber = scanner.nextInt();
              if ((userNumber != 0) && (userNumber != -1) && (userNumber != 1)) {
                  System.out.println("Ваше число должно быть 0 или -1 или 1");
              }
             switch (userNumber) {
                case 0:
                    System.out.println("Спасибо за игру!");
                    break;
                case -1:
                    userNumberMax = pcNumber;
                    pcNumber = Math.floorDiv((pcNumber+userNumberMin), 2);
                    if (pcNumber==1) {
                        userNumber=0;
                        System.out.println("Спасибо за игру! Ваше число 1");
                    }
                    break;
                case 1:
                    userNumberMin = pcNumber;
                    pcNumber = Math.floorDiv(((pcNumber + userNumberMax)+1), 2);
                        if (pcNumber==100) {
                            userNumber=0;
                            System.out.println("Спасибо за игру! Ваше число 100");
                        }
                    break;
             }
        }

    }
}
// Использовал что-то вроде метода деления отрезка пополам.
