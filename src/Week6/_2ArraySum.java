package Week6;


import java.util.Random;

public class _2ArraySum {
    static int [] myArray = new int [10];

    public static void main (String [] args) {
        int sumArray = 0;
        Random randomGenerator = new Random();
        for (int i=0; i<myArray.length; i++ ) {
            int randomNumber = randomGenerator.nextInt(100);
            myArray[i] = randomNumber;
            sumArray = sumArray + myArray[i];
        }

        for (int n : myArray) {
            System.out.println (n);
        }
        System.out.println ("Сумма массива: " + sumArray);

    }

}
