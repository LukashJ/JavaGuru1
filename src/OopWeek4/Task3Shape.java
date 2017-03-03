package OopWeek4;


import java.util.ArrayList;
import java.util.Random;

public class Task3Shape {
    public static void main (String [] args){
        ArrayList <Shape> shapeList= new ArrayList<Shape>();
        Random randomNumber = new Random();
            int aSide = randomNumber.nextInt(10)+1;
            int bSide = randomNumber.nextInt(10)+1;
            int cSide = randomNumber.nextInt(10)+1;
            int rRadius = randomNumber.nextInt(10)+1;
        shapeList.add(new Rectangle(aSide, bSide));
        shapeList.add(new Circle(rRadius));
        shapeList.add(new Triangle(aSide, bSide, cSide));

        double sumSquare =0;
        for (Shape shape:shapeList) { //иногда может быть некорректно, когда по RND у треугольника
            // сумма двух сторон меньше длины третье стороны
            sumSquare = sumSquare+shape.calculateSquare();
        }
        System.out.println("Sum of shapes: " + sumSquare);
    }
}

abstract class Shape {

    public abstract double calculateSquare();

}

class Rectangle extends Shape {
    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }
    public double calculateSquare() {
        return this.aSide*this.bSide;
    }
}

class Circle extends Shape {
    private double rRadius;

    public Circle(double rRadius) {
        this.rRadius = rRadius;
    }

    public double calculateSquare() {
        return Math.PI*this.rRadius*this.rRadius;
    }
}

class Triangle extends Shape {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double calculateSquare() {
        double p = (this.aSide + this.bSide + this.cSide) / 2;
        return Math.sqrt(p * (p - this.aSide) * (p - this.bSide) * (p - this.cSide));
    }
}

