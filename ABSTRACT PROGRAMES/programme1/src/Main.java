/*
/Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method
to make a specific sound for each animal.
 */

abstract class Animal{

    public abstract void sound();
}

class Lion extends Animal{

    public void sound()
    {
        System.out.println("THE LION SHOULD BE ROARS...!!");
    }

    public void color()
    {
        System.out.println("THE LION LOOKS LIKE A PALE YELLOW COLOR...!!");
    }

    public void speed()
    {
        System.out.println("THE LION SHOULD TRAVEL 30KM PER HOUR IN THE WILD...!!");
    }
}


class Tiger extends Animal{

    public void sound()
    {
        System.out.println("THE TIGER GROWLS IN THE WILD WITH BRAVELY..!!");
    }

    public void natives()
    {
        System.out.println("SOUTH AFRICA IS THE NATIVE PLACE FOR THE TIGERS..!! ");
    }

    public void color()
    {
        System.out.println("THE TIGER LOOKS LIKE A YELLOW WITH BLACK LINES IN OUR WHOLE BODY..!!");
    }

    public void strength()
    {
        System.out.println("THE TIGER CAN ABLE TO PRODUCE 1000KG ENERGY PER MINUTE..!!");
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("WELCOME ABSTRACT CLASS WORLD PRAJEESH..!!");

        System.out.println(" ");
        Animal lion = new Lion();
        lion.sound();

        Lion l = new Lion();
        l.color();
        l.speed();

        System.out.println(" ");
        Animal tiger = new Tiger();
        tiger.sound();

        Tiger t = new Tiger();
        t.color();
        t.natives();
        t.strength();
        System.out.println(" ");

    }
}