package OopWeek3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task4MaxNnumbers {

    public static void main (String [] args) {
        ArrayList <Integer> numbersList = new ArrayList<Integer>();
        Random randomGenerator = new Random ();
        int listLenght = randomGenerator.nextInt(1000); // генерируем длину списка
        for (int i=0; i<listLenght; i++) {
            int rndNumber = randomGenerator.nextInt(200);
            numbersList.add(rndNumber); // заполняем список числами 0-200
        }

        for (int i:numbersList){
            System.out.println(i);
        }

        Collections.sort(numbersList);

        Scanner scanner =new Scanner(System.in);
        System.out.println ("Please enter N number:");
        int nNumber = scanner.nextInt();
        System.out.println ("Please enter -1 for N min numbers or 1 for N max numbers");
        int minmaxSelector = scanner.nextInt();

        if (minmaxSelector == -1) {
            for (int i = 0; i < nNumber; i++) {
                System.out.println (numbersList.get(i));
            }
        }else if (minmaxSelector == 1) {
            for (int i = numbersList.size()-1; i > numbersList.size()- nNumber; i--) {
                System.out.println (numbersList.get(i));
            }
        }else{
                    System.out.println("Please enter -1 or 1");
                }

    }
}

