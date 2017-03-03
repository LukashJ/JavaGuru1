package OopWeek1;


import java.util.Scanner;

public class Task1ConcatStringNew {

// Переделал на concat метод, вместо "+" в первой версии

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println ("Please enter string1:");
        String string1 = scanner.nextLine();
            System.out.println ("Please enter string2:");
        String string2 = scanner.nextLine();
        String stringSum = string1.concat(string2);
            System.out.println(stringSum);
    }
}
