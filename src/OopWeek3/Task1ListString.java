package OopWeek3;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task1ListString {

    public static void main (String [] args) {
        Set <String> set = new TreeSet<String>();
        Scanner scanner = new Scanner (System.in);
        String stringFromConsol;
        do {
            stringFromConsol = scanner.nextLine();
            set.add(stringFromConsol);
        } while (!stringFromConsol.equals(""));
    for (String string:set){
        System.out.println(string);
    }
    }
}
