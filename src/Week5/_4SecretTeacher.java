package Week5;

import java.util.Random;
import java.util.Scanner;

public class _4SecretTeacher {

    public static void main(String[] args) {

        System.out.println("Пожалуйста, загадайте число от 1 до 100");
        Random randomGenerator = new Random();

        int minPossibleNumber = 1;
        int maxPossibleNumber = 100;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int pcGuessedNumber = minPossibleNumber + randomGenerator.nextInt(maxPossibleNumber - minPossibleNumber);

            System.out.println("Ваше число:" + pcGuessedNumber + "?");
            System.out.println("Введите: 0, если компьютер угадал;");
            System.out.println("        -1, если Ваше число меньше");
            System.out.println("         1, если Ваше число больше");

            int userResponse = scanner.nextInt();
            if(userResponse == 0) {
                System.out.println("Спасибо за игру!");
                break;
            } else if(userResponse == -1) {
                maxPossibleNumber = pcGuessedNumber - 1;
            } else if(userResponse == 1) {
                minPossibleNumber = pcGuessedNumber + 1;
            } else {
                System.out.println("Ваше число должно быть 0 или -1 или 1");
            }
        }

    }

}

