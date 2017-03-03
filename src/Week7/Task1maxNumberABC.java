package Week7;

import java.util.Scanner;

/**
 * Created by sergejs on 19.11.16.
 */
public class Task1maxNumberABC {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter Number A");
        int userNumberA = scanner.nextInt();
        System.out.println ("Please enter Number B");
        int userNumberB = scanner.nextInt();
        System.out.println ("Please enter Number C");
        int userNumberC = scanner.nextInt();
        System.out.println ("Your Numbers " + userNumberA + "; " + userNumberB + "; " + userNumberC);

        if ((userNumberA == userNumberB) && (userNumberA == userNumberC)) {
            System.out.println("A==B==C");
        } else if ((userNumberA >= userNumberB) && (userNumberA >= userNumberC)) {
            System.out.println("Max number is: " + userNumberA);
        } else if (userNumberB >= userNumberC) {
            System.out.println("Max number is: " + userNumberB);
        } else {
            System.out.println("Max number is: " + userNumberC);
        }
    }
}
