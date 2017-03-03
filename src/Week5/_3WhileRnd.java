package Week5;


import java.util.Random;
import java.util.Scanner;

public class _3WhileRnd {
    public static void main (String[] args) {
      Random randomGenerator = new Random();
       int randomNumber = randomGenerator.nextInt(100);
      Scanner scanner = new Scanner(System.in);
       int userNumber = randomNumber+1;
     while (randomNumber != userNumber) {
           System.out.println("Please enter your Number");
           userNumber = scanner.nextInt();
            if (randomNumber < userNumber) {
                System.out.println("Your Number is more");
            } else {
                System.out.println("Your Number is less");
            }
        }
        System.out.println("You got it!");
    }
}
