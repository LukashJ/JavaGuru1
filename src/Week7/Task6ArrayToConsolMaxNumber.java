package Week7;


import java.util.Random;

public class Task6ArrayToConsolMaxNumber {
    public static void main (String [] args) {
        int [] myArray;
        myArray=createRndArray();
        printMyArray(myArray);
        System.out.println ("Max Number: " + maxNumberArray(myArray));

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

    private static int maxNumberArray (int [] myArray) {
        int maxArray = myArray[0];
        for (int i:myArray)
            if (i>maxArray) maxArray=i;
        return maxArray;
    }
}
