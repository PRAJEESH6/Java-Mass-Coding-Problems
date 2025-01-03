/*
/Write a Java program to create a Animal interface with a method called bark() that takes no
arguments and returns void. Create a Dog class that implements Animal and overrides speak()
to print "Dog is barking".
 */

class Dog implements Animal{

    @Override
    public void Bark() {
        System.out.println("Dog is Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! PRAJEESH");

        Dog dog = new Dog();
        dog.Bark();
    }
}