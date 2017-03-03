package Week2;


import java.util.Scanner;

public class Week2_8Quadratic_equation {
    public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A from quadratic equation: ");
        int quadratic_equationA = scanner.nextInt();
        System.out.println("Please enter B from quadratic equation:");
        int quadratic_equationB = scanner.nextInt();
        System.out.println("Please enter C from quadratic equation:");
        int quadratic_equationC = scanner.nextInt();
        double quadratic_equationDiscriminant = Math.pow(quadratic_equationB,2)- 4*quadratic_equationA*quadratic_equationC;
        if (quadratic_equationDiscriminant < 0) {
            System.out.println("Корней на множестве действительных чисел нет");
        } else if (quadratic_equationDiscriminant == 0) {
            System.out.println("Корень уравнения х=" + quadratic_equationB / 2*quadratic_equationA*-1);
        } else {
            double x1=(-1*quadratic_equationB - Math.sqrt(quadratic_equationDiscriminant))/2*quadratic_equationA;
            double x2=(-1*quadratic_equationB + Math.sqrt(quadratic_equationDiscriminant))/2*quadratic_equationA;
            System.out.println("Корени уравнения х1="+ x1 + ", x2=" + x2 );
        }
    }

}
