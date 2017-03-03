package OopWeek1;


import java.util.Scanner;

public class Task4Convers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string:");
        String string = scanner.nextLine();
        char arrayString[] = string.toCharArray();
        int sumStringNumber = 0;
        StringBuilder tempString = new StringBuilder();
        for (char a : arrayString) {
             if (a != ' ') {
                tempString = tempString.append(a);
             } else {
                sumStringNumber = sumStringNumber + Integer.parseInt(tempString.toString());
                 tempString=new StringBuilder(); /* В этом месте довольно коряво,
                 но я не нашел другого способа сделать эту строку пустой.
                 Если tempString = null, то почему-то при добавлении символа '1'
                 получается null1 */
            }
        }
        sumStringNumber = sumStringNumber + Integer.parseInt(tempString.toString());
        System.out.println("Sum String Numbers: "+ sumStringNumber);
    }
}