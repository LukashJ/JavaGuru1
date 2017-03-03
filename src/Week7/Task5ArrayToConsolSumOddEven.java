package Week7;


import java.util.Random;

public class Task5ArrayToConsolSumOddEven {

    public static void main (String [] args) {
    int [] myArray;
        myArray=createRndArray();
        printMyArray(myArray);
        System.out.println ("Sum Odd: " + sumArrayOdd(myArray));
        System.out.println ("Sum Even: " + sumArrayEven(myArray));
    }

    private static int [] createRndArray () {
        int[] myArray = new int[10];
        Random randomgenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomgenerator.nextInt(10);
        }
        return myArray;
    }

    private static void printMyArray (int [] myArray) {
        for (int i:myArray) System.out.println (i);
    }

    private static int sumArrayOdd (int [] myArray) {
        int sumOdd = 0;
        for (int i:myArray)
            if (i%2==1) sumOdd+=i;
        return sumOdd;
    }
    private static int sumArrayEven (int [] myArray) {
        int sumEven = 0;
        for (int i:myArray)
            if (i%2==0) sumEven+=i;
        return sumEven;
    }
    }

