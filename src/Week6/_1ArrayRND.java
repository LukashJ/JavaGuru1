package Week6;


import java.util.Random;

public class _1ArrayRND {

    static int [] myArray = new int [10];

    public static void main (String [] args) {
       Random randomGenerator = new Random();
        for (int i=0; i<myArray.length; i++ ) {
           int randomNumber = randomGenerator.nextInt(100);
           myArray[i] = randomNumber;
           }

        for (int n : myArray) {
            System.out.println (n);

        }
       }
   }
