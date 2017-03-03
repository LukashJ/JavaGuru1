package Week7;

import java.util.Scanner;


public class Task1maxNumberABCbyMetod {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] userNumbersArrays = new int [3];
            for (int i=0; i<3; i++) {
            System.out.println ("Please enter number by order " + i);
            userNumbersArrays [i] = scanner.nextInt();
        }
        findMaxNumber(userNumbersArrays);
    }

    private static void findMaxNumber (int [] mArray) {
        if ((mArray[0] == mArray[1]) && (mArray[0] == mArray[2])) {
            System.out.println("A==B==C");
        } else if ((mArray[0] >= mArray[1]) && (mArray[0] >= mArray[2])) {
            System.out.println("Max number is: " + mArray[0]);
        } else if (mArray[1] >= mArray[2]) {
            System.out.println("Max number is: " + mArray[1]);
        } else {
            System.out.println("Max number is: " + mArray[2]);
        }
    }
}
