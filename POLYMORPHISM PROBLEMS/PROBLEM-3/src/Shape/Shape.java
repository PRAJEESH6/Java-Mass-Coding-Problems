package Shape;

// Write a Java program to create a base class Shape with a method called calculateArea().
// Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea()
// method in each subclass to calculate and return the shape's area.


public class Shape {

    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");

        Shapes shapes = new Shapes();
        Circle circle = new Circle(50.0);
        Rectangle rectangle = new Rectangle(500.90,700.00);
        Triangle triangle = new Triangle(500.80,400.00);

        System.out.println(" ");
        System.out.println("Your Main Shape IS : " + shapes.CalculateArea());
        System.out.println(" ");
        System.out.println("Your Circle Length Is : " + circle.CalculateArea());
        System.out.println(" ");
        System.out.println("Your Rectangle Length IS : " + rectangle.CalculateArea());
        System.out.println(" ");
        System.out.println("Your Triangle Length IS : " + triangle.CalculateArea());
        System.out.println(" ");
    }
}
