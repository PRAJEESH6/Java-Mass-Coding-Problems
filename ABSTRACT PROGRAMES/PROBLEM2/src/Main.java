
/*
  Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
  Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate
  the area and perimeter of each shape.
 */

import java.util.Scanner;

abstract class Shape{

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape{

   private double radious;

    public Circle(double radious)
    {
        this.radious = radious;
    }

    @Override
    public double calculateArea() {

        return Math.PI * radious * radious;
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radious;
    }
}

class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    public  Triangle(double side1, double side2, double side3)
    {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
    }

    @Override
    public double calculateArea() {

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter()
    {
        return side1 + side2 + side3;
    }
}


public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH");
        System.out.println(" ");

        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE CIRCULAR VALUE EX-(4.0) => ");
        double CircleValue = in.nextDouble();
        System.out.println(" ");

        System.out.println("ENTER FIRST TRIANGLE VALUE  => ");
        double ts1 = in.nextDouble();

        System.out.println("ENTER SECOND TRIANGLE VALUE => ");
        double ts2 = in.nextDouble();

        System.out.println("ENTER THIRD TRIANGLE VALUE => ");
        double ts3 = in.nextDouble();

        double r = CircleValue;
        Circle circle= new Circle(r);

        double s1 = ts1;
        double s2 = ts2;
        double s3 = ts3;
        Triangle triangle = new Triangle(s1, s2, s3);

        System.out.println("CIRCLE ACTUAL VALUE IS : " + CircleValue);
        System.out.println("CIRCLE AREA IS : " + circle.calculateArea());
        System.out.println("CIRCLE PERIMETER  IS : " + circle.calculatePerimeter());
        System.out.println(" ");

        System.out.println("ACTUAL TRIANGLE VALUES IS : " + ts1 +"," + ts2 + "," + ts3);
        System.out.println("TRIANGLE AREA IS : " + triangle.calculateArea());
        System.out.println("TRIANGLE PERIMETER IS : " + triangle.calculatePerimeter());
        System.out.println(" ");

    }
}