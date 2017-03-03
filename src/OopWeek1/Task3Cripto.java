package OopWeek1;

import java.util.Scanner;

public class Task3Cripto {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter string:");
        String string = scanner.nextLine();
        String stringCrypt = crypt(string);
            System.out.println ("Зашифрованая строка " + stringCrypt);
            System.out.println ("Дешифрованая строка " + deCrypt(stringCrypt));
    }

    private static String crypt (String s){
        String string = new StringBuilder(s).reverse().toString();
            return string;
    }

    private static String deCrypt (String s){
        String string = new StringBuilder(s).reverse().toString();
            return string;
    }
}
