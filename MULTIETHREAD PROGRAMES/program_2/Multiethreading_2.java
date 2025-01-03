package program_2;

class Thread_1 extends Thread {
    private static final int Max_Number = 20;

    public void run() {
        for (int i = 1; i <= Max_Number; i++) {
            if (i % 2 != 0) {
                System.out.println("THE ODD NUMBER THREAD PRINTS : " + i);
            }
        }
    }
}

class Therad_2 {

    public void run() {
        int Max_Number1 = 20;
        for (int j = 1; j <= Max_Number1; j++) {
            if (j % 2 == 0) {
                System.out.println("THE EVEN NUMBER THREAD PRINTS :  " + j);
            }
        }

    }
}

public class Multiethreading_2 {


    public static void main(String args[])
    {
        System.out.println("WELCOME JAVA MULTIETHREADING WORLD PRAJEESH...!!");

        Thread_1 thread = new Thread_1();
        Therad_2 therad2 = new Therad_2();

        thread.run();
        therad2.run();
    }
}
