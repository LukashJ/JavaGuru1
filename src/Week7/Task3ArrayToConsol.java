package Week7;

import java.util.Random;

public class Task3ArrayToConsol {

    public static void main (String [] args) {
    int [] myArray;
        myArray = createRndArray();
        printArray (myArray);
    }

    private static int [] createRndArray() {
        int [] myArray = new int [10];
        Random randomGenerator = new Random ();
        for (int i=0; i<myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(10);
        }
        return myArray;
    }

    private static void printArray (int [] myArray) {
        for (int aMyArray : myArray) {
            System.out.println(aMyArray);
        }
    }
}
