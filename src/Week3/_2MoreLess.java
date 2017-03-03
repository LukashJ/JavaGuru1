package Week3;


import java.util.Scanner;

public class _2MoreLess {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter your Number1");
        int number1 = scanner.nextInt();
        System.out.println ("Please enter your Number2");
        int number2 = scanner.nextInt();
        if (number1==number2) {
            System.out.println ("Number1 == Number2");
        } else if (number1<number2) {
            System.out.println ("Number2 is more");
        } else {
            System.out.println ("Number1 is more");
        }
    }

}
