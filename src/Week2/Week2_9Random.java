package Week2;


import java.util.Random;

public class Week2_9Random {

    public static void main (String[] args) {
       Random randomGenerator = new Random();
        int randomNumber1 = randomGenerator.nextInt(100);
        int randomNumber2 = randomGenerator.nextInt(100);
        int randomNumber3 = randomGenerator.nextInt(100);
        int randomNumberSum = randomNumber1 +  randomNumber2 + randomNumber3;
       System.out.println("Случайные числа: "+ randomNumber1 + ", " + randomNumber2 + ", " + randomNumber3);
       System.out.println("Сумма случайных чисел: "+ randomNumberSum);
    }

}
