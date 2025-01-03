
/*
Write a Java program to create an interface Shape with the getArea() method. Create three classes
 Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method
 for each of the three classes./
 */


import java.util.Scanner;

class Circle implements Shape{

    double radious;

    Circle(double radious)
    {
        this.radious = radious;
    }

    @Override
    public void GetArea() {

        System.out.println("CIRCLE AREA IS : " + Math.PI * radious * radious);
    }
}


class Rectangle implements Shape{

    double length;
    double breath;

    Rectangle(double length, double breath)
    {
       this.length = length;
       this.breath = breath;
    }

    @Override
    public void GetArea() {

        System.out.println("RECTANGLE AREA IS : " + length * breath);
    }
}

class Triangle implements Shape{

    double base;
    double height;

    Triangle(double base, double height)
    {
       this.base = base;
       this.height = height;
    }

    @Override
    public void GetArea() {

        System.out.println("TRIANGLE AREA IS : " + 0.5 * base * height);
    }
}


public class Main {
    public static void main(String[] args)

    {
        System.out.println("Hello world! PRAJEESH");

        Scanner in = new Scanner(System.in);

        System.out.println("PLEASE PROVIDE YOUR VALUE OF AREA OF CIRCLE : ");
        double CircleValue = in.nextDouble();

        System.out.println("PLEASE PROVIDE YOUR VALUE OF AREA OF RECTANGLE IN LENGTH : ");
        double RectangleLength = in.nextDouble();

        System.out.println("PLEASE PROVIDE YOUR VALUE OF AREA OF RECTANGLE IN BREATH : ");
        double RectangleBreath = in.nextDouble();

        System.out.println("PLEASE PROVIDE YOUR VALUE OF AREA OF TRAINGLE FOR BASE : ");
        double TraingleBase = in.nextDouble();

        System.out.println("PLEASE PROVIDE YOUR VALUE OF AREA OF TRAINGLE FOR HEIGHT : ");
        double TraingleHeight = in.nextDouble();

        Circle circle = new Circle(CircleValue);
        circle.GetArea();

        Rectangle rectangle = new Rectangle(RectangleLength,RectangleBreath);
        rectangle.GetArea();

        Triangle triangle = new Triangle(TraingleBase,TraingleHeight);
        triangle.GetArea();
    }
}