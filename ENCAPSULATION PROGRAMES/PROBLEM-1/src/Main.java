
//Write a Java program to create a class called Person with private instance variables name, age.
// and country. Provide public getter and setter methods to access and modify these variables.

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);

        Person person = new Person();

        System.out.println("PROVIDE THE PERSON NAME : " );
        String n = in.next();
        System.out.println(" ");

        System.out.println("PROVIDE THE PERSON AGE : ");
        String a = in.next();
        System.out.println(" ");

        System.out.println("PROVIDE THE PERSON COUNTRY : ");
        String c = in.next();
        System.out.println(" ");

        person.setName(n);
        person.setAge(a);
        person.setCountry(c);

        String name = person.getName();
        String age = person.getAge();
        String country = person.getCountry();

        System.out.println(" ");
        System.out.println("PERSON NAME IS : " + name);
        System.out.println(" ");
        System.out.println("PERSON AGE IS : " + age);
        System.out.println(" ");
        System.out.println("PERSON COUNTRY IS : " + country);
        System.out.println(" ");
    }
}