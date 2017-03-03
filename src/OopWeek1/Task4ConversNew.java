package OopWeek1;


import java.util.Scanner;

public class Task4ConversNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string:");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println("Sum String Numbers: " + sumStringArray(stringBuilder));
    }
    private static int sumStringArray (StringBuilder s){
        int sumArray=0;
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !=' ') {
                tempString.append(s.charAt(i));
            }
            if ((s.charAt(i) ==' ') || (i==s.length()-1)){
                sumArray = sumArray + Integer.parseInt(tempString.toString());
                tempString.delete(0,tempString.length());
            }
        }
        return sumArray;
    }
}