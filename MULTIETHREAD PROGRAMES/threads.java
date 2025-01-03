
/*
Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
 */

public class threads extends Thread {

    public void run()
    {
        System.out.println("HELLO WORLD - PRAJEESH");
    }

    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH");

        threads thread = new threads();
        thread.start();
        thread.setName("praju");
        thread.setPriority(MAX_PRIORITY);

        System.out.println("THREAD NAME IS     : " + thread.getName());
        System.out.println("THREAD PRIORITY IS : " + thread.getPriority());
    }
}
