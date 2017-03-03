package Week6;


import java.util.Random;

public class _3ArrayOddEven {
    static int [] myArray = new int [10];

    public static void main (String [] args) {
        int sumOdd = 0;
        int sumEven = 0;

        Random randomGenerator = new Random();

        for (int i=0; i<myArray.length; i++ ) {
            int randomNumber = randomGenerator.nextInt(100);
            myArray[i] = randomNumber;

            if ((myArray[i] % 2) == 0) {
                sumEven = sumEven + myArray[i];
            } else {
                sumOdd = sumOdd + myArray[i];
            }
        }

        for (int n : myArray) {
            System.out.println (n);
        }
        System.out.println ("Сумма четных чисел в массиве: " + sumEven);
        System.out.println ("Сумма нечетных чисел в массиве: " + sumOdd);
    }
}
