package Week6;


import java.util.Random;

public class _5ArrayFirstMax {

    static int [] myArray = new int [10];

    public static void main (String [] args) {

        Random randomGenerator = new Random();
        for (int i=0; i<myArray.length; i++ ) {
            int randomNumber = randomGenerator.nextInt(100);
            myArray[i] = randomNumber;
        }

        int maxArray = myArray[0];
        int firstArrray = myArray[0];
        int iMax = 0;

        for (int i=0; i<myArray.length; i++) {
            System.out.println (myArray[i]);
            if (maxArray < myArray [i]) {
                maxArray = myArray [i];
                iMax = i;
            }
        }
        System.out.println ("Наибольшее число в массиве: " + maxArray);
        myArray[0]=maxArray;
        myArray[iMax]=firstArrray;
        System.out.println ("Теперь стоит первым в массиве.");
    }
}

// Как в цикле  for (int n : myArray) узнать номер элемнта в массиве? Т.е. найти максимальный элемент я могу,
// но как узнать его порядковый номер?