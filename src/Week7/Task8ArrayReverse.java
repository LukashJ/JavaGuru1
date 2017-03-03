package Week7;


import java.util.Random;

public class Task8ArrayReverse {

    public static void main(String[] args) {
        int [] myArray;
        myArray=createRndArray();
        System.out.println("Start Array:");
        printMyArray(myArray);
        myArray=arrayReverse(myArray);
        System.out.println("Reverse Array:");
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

    private static int [] arrayReverse (int [] myArray) {
        int i,j;
        int tempNumber;
            for (i=0, j=myArray.length-1; i<j; i++, j--) {
                tempNumber=myArray[i];
                myArray[i]=myArray[j];
                myArray[j]=tempNumber;
            }
        return myArray;
}

}