import java.util.Scanner;

public class Main {

    static int Factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n*Factorial(n-1);
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR RESPECTIVE NUMBER..");
        int n = in.nextInt();
        System.out.println(" ");

        System.out.println("EVALUVATED ANSWER IS :  " + Factorial(n));

    }
}