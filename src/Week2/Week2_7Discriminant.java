package com.Week2;

import java.util.Scanner;

public class Week2_7Discriminant {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A from quadratic equation: ");
        int quadratic_equationA = scanner.nextInt();
        System.out.println("Please enter B from quadratic equation:");
        int quadratic_equationB = scanner.nextInt();
        System.out.println("Please enter C from quadratic equation:");
        int quadratic_equationC = scanner.nextInt();
        double quadratic_equationDiscriminant = Math.pow(quadratic_equationB,2)- 4*quadratic_equationA*quadratic_equationC;
        System.out.println("Discriminant your quadratic equation is " + quadratic_equationDiscriminant);
    }
}
