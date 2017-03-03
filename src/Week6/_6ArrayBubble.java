package Week6;


import java.util.Random;

public class _6ArrayBubble {

    static int [] myArray = new int [10];

    public static void main (String [] args) {

        Random randomGenerator = new Random();
        for (int i=0; i<myArray.length; i++ ) {
            int randomNumber = randomGenerator.nextInt(100);
            myArray[i] = randomNumber;
            System.out.println (myArray [i]);
        }

        int tempNumber = myArray[0];

        for(int i = 0; i < myArray.length - 1; i++){
            for(int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]){
                   tempNumber = myArray [j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempNumber;
                }
            }
        }
        System.out.println ("Массив отсортирован:");
        for (int n : myArray) {
            System.out.println (n);
        }
    }
}
// Как поменять местами 2 элемента массива без промежуточной переменной?