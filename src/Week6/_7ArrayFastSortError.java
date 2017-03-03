package Week6;

import java.util.Random;

public class _7ArrayFastSortError {

    public static int [] fastsort(int [] inArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return inArray;
        }
     //   int i = startIndex;
        int j = endIndex;
        int arrayMiddleIndex = startIndex + Math.floorDiv((j - startIndex), 2);
        while (startIndex < j) {
            while ((startIndex < arrayMiddleIndex) && (inArray[startIndex] <= inArray[arrayMiddleIndex])) startIndex++;
            while ((j > arrayMiddleIndex) && (inArray[j] >= inArray[arrayMiddleIndex])) j--;
            if (startIndex < j) {
                int tempNumber = inArray[startIndex];
                inArray[startIndex] = inArray[j];
                inArray[j] = tempNumber;
            }
            if (startIndex == arrayMiddleIndex) {
                arrayMiddleIndex = startIndex;
            } else {
                if (j == arrayMiddleIndex) {
                    arrayMiddleIndex = j;
                }
            }

            fastsort(inArray, startIndex, arrayMiddleIndex);
            fastsort(inArray, arrayMiddleIndex + 1, endIndex);

        }
        return inArray;
    }

    public static void main(String[] args) {
        int[] myArray = new int[10];
        Random randomGenerator = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = randomGenerator.nextInt(100);
            System.out.println(myArray[i]);
        }
        myArray = fastsort(myArray, 0, myArray.length - 1);

        System.out.println("Массив отсортирован:");
        for (int n : myArray) {
            System.out.println(n);
        }

    }
}
