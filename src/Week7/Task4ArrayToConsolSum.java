package Week7;

import java.util.Random;


public class Task4ArrayToConsolSum {

    public static void main (String [] args) {
        int[] myArray;
        myArray=createRndArray();
        printMyArray(myArray);
        System.out.println ("Sum: "+sumArray(myArray));
    }

     private static int [] createRndArray() {
            int [] myArray = new int[10];
            Random randomGenerator = new Random();
            for (int i=0; i<myArray.length; i++) {
                myArray[i] = randomGenerator.nextInt(10);
            }
            return myArray;
        }

     private static void printMyArray (int [] myArray) {
         for (int i : myArray) {
             System.out.println(i);
         }
     }
     private static int sumArray(int [] myArray) {
        int sumMyArray = 0;
        for (int i : myArray) sumMyArray+=i;
        return sumMyArray;
    }
}

