package Week5;


import java.util.Random;
import java.util.Scanner;

public class _3WhileRND2 {
    public static void main (String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your Number");
            int userNumber = scanner.nextInt();
            if (randomNumber < userNumber) {
                System.out.println("Your Number is more");
            } else {
                if (randomNumber > userNumber) {
                    System.out.println("Your Number is less");
                } else {
                    break;
                }
            }
        }
        System.out.println("You got it!");
    }
}
