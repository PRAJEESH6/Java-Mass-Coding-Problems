
//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
// Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods
// to start and stop the engines for each vehicle type.

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH");

        Abstract Cars = new Car();
        Abstract Bikes = new MotorCycle();

        System.out.println("....................... ");

        Cars.StartEngine();
        Cars.StopEngine();
        System.out.println("....................... ");

        Bikes.StartEngine();
        Bikes.StopEngine();
        System.out.println("....................... ");
    }
}