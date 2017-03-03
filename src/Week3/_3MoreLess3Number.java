package Week3;


import java.util.Scanner;

public class _3MoreLess3Number {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Please enter your Number1");
        int number1 = scanner.nextInt();
        System.out.println ("Please enter your Number2");
        int number2 = scanner.nextInt();
        System.out.println ("Please enter your Number3");
        int number3 = scanner.nextInt();
        if ((number1==number2) && (number2==number3)) {
            System.out.println ("Number1 == Number2 == Number3");
        } else if ((number1>number2) && (number1>number3)) {
            System.out.println ("Number1 is more");
        } else if (number2>number3){
            System.out.println ("Number2 is more");
        } else {
            System.out.println ("Number3 is more");
        }
    }
}
// В условиях задачи сказано вывести наибольшее и только, если все 3 равны сообшить об этом,
// поэтому если равны 2 из 3 и они наибольшие, то просто вывожу любое,
// без сообщения, что есть еще одно такое же