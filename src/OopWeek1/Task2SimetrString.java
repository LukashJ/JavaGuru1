package OopWeek1;

import java.util.Scanner;

public class Task2SimetrString {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter string:");
        String string1 = scanner.nextLine();
        String string2 = new StringBuilder(string1).reverse().toString();
        if (string1.equals(string2)) System.out.println("Строка симметрична");
            else System.out.println("Строка несимметрична");
    }
}

