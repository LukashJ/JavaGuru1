package Week7;


import java.util.Scanner;

public class Task2MaxNumberAB {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите число А:");
        int userNumberA = scanner.nextInt();
        System.out.println ("Введите число B:");
        int userNumberB = scanner.nextInt();
        findMaxNumber(userNumberA, userNumberB);

    }
     private static void findMaxNumber (int userNumberA, int userNumberB) {
        if (userNumberA > userNumberB) {
            System.out.println ("Число А больше: " + userNumberA);
        } else if (userNumberB > userNumberA) {
            System.out.println ("Число B больше: " + userNumberB);
        } else { System.out.println ("A == B");}
     }

}
