import java.util.Scanner;

public class Problem3 {
    public static void main(String args[])
    {
        System.out.println("Welcome prajeesh...");
        Scanner in= new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER...");
        int i = in.nextInt();
        Recursion(i);
    }

    public static void Recursion(int i)
    {
        if (i == 0)
        {
            System.exit(1);
        }

        if(i > 0)
        {
            System.out.println(i);
            i--;
            Recursion(i);
        }
    }
}
