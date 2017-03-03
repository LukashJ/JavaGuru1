package OopWeek1;

import java.util.Scanner;

public class Task3CriptoNew {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter string:");
        String string = scanner.nextLine();
        StringBuilder stringForCrypt = new StringBuilder(string);
        StringBuilder stringCrypt = crypt(stringForCrypt);
            System.out.println ("Зашифрованая строка " + stringCrypt);
            System.out.println ("Дешифрованая строка " + deCrypt(stringCrypt));
    }

// Переписал методы согласно замечению. Чтоб никто не догадался, что это строка наоборот

    private static StringBuilder crypt (StringBuilder s){
       int tempInt;
        for (int i = 0; i < s.length(); ++i) {
            tempInt=((int) s.charAt(i) + 10);
            s.setCharAt(i,(char)tempInt);
        }
        return s;
    }

    private static StringBuilder deCrypt (StringBuilder s) {
        int tempInt;
        for (int i = 0; i < s.length(); ++i) {
            tempInt = ((int) s.charAt(i) - 10);
            s.setCharAt(i, (char)tempInt);
        }
        return s;
    }
}
