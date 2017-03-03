package Week6;


import java.util.Random;
import java.util.Scanner;

public class _8ArraySearch {

    public static void main (String [] args) {

//Создание массива
        Random randomGenerator = new Random();
        int [] myArray = new int [10];
        for (int i=0; i<myArray.length; i++ ) {
            int randomNumber = randomGenerator.nextInt(100);
            myArray[i] = randomNumber;
            System.out.println (myArray [i]);
        }

//Сортировка масива
        for(int i = 0; i < myArray.length - 1; i++){
            for(int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]){
                    int tempNumber = myArray [j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempNumber;
                }
            }
        }
        System.out.println ("Массив отсортирован:");
        for (int n : myArray) {
            System.out.println (n);
        }

//Ввод числа пользователя
    System.out.println ("Введите число от 1 до 100:");
    Scanner scanner = new Scanner(System.in);
    int userNumber = scanner.nextInt();

//Проверка крайних значений
     if (userNumber < myArray[0]) {
         System.out.println("Ваше число меньше всех чисел массива");
     } else if (userNumber>myArray[myArray.length-1]) {
         System.out.println("Ваше число больше всех чисел массива");
     } else {

//Поиск элемента в массиве методом деления пополам
       int minIndex=0;
       int maxIndex=myArray.length-1;
       int midleIndex = Math.floorDiv((maxIndex+minIndex),2);
         while (true) {
                if ((userNumber > myArray [midleIndex]) && ((maxIndex-minIndex) > 1)) {
                    minIndex = midleIndex;
                } else if ((userNumber < myArray [midleIndex]) && ((maxIndex-minIndex) > 1)) {
                    maxIndex = midleIndex;
                } else if (userNumber == myArray [maxIndex]) {
                    System.out.println("Ваше число в массиве имеет индекс: " + (midleIndex+1));
                    break;
                } else if (userNumber == myArray [midleIndex]) {
                    System.out.println("Ваше число в массиве имеет индекс: " + midleIndex);
                    break;
                } else {
                    System.out.println("Ваше число находится между индексами: " + midleIndex + " и " + maxIndex );
                    break;
             }
             midleIndex = Math.floorDiv((maxIndex+minIndex),2);
         }
     }
    }
}
// Если числа нет в массиве, то вывожу соседние индексы
// В принципе можно еще обрабатывать ситуацию, когда в массиве есть больше одного искомого числа, но суть
// деления пополам это не меняет.
// Вообще этот метод уже применял в 5-ой неделе в 4-ом задании
// Правда Вы его забраковали.
