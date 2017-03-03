package Week7;


import java.util.Random;

public class Task7ArrayToConsolSort {

    public static void main (String [] args) {
        int [] myArray;
        myArray=createRndArray();
        printMyArray(myArray);
        myArray=bubleSort(myArray);
        System.out.println ("Sorted: ");
        printMyArray(myArray);
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

    private static int [] bubleSort (int [] myArray) {
        int tempNumber;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    tempNumber = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = tempNumber;
                }
            }
        }
        return myArray;
    }
}
