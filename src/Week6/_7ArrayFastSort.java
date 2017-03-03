package Week6;


import java.util.Random;

public class _7ArrayFastSort {

    public static int [] fastsort(int [] inArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return inArray;
        }
        int i = startIndex;
        int j = endIndex;
        int arrayMiddleIndex = i + Math.floorDiv((j - i), 2);

        while (i < j) {
            while ((i < arrayMiddleIndex) && (inArray[i] <= inArray[arrayMiddleIndex])) i++;
            while ((j > arrayMiddleIndex) && (inArray[j] >= inArray[arrayMiddleIndex])) j--;
            if (i < j) {
                int tempNumber = inArray[i];
                inArray[i] = inArray[j];
                inArray[j] = tempNumber;
            }
            if (i == arrayMiddleIndex) {
                arrayMiddleIndex = i;
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