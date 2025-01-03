import java.util.Collections;
import java.util.Vector;

public class Factorial {
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH...");
        int n = 3;

        //Bottom Up Approach
        Vector<Integer> array = new Vector<>(Collections.nCopies(n+1,0));
        array.set(0,0);
        array.set(1,1);

        for (int p=2;p<=n;p++)
        {
            array.set(p, p * array.get(p-1));
        }

        int i = array.get(n);
        System.out.println("Bottom Up Approach : " + i);

        //TopDown Approach...
        Vector<Integer> Dp = new Vector<>(Collections.nCopies(n+1,-1));
        System.out.println("Top Down Approach : " + TopDown(n,Dp));

        //Recursion Approach...
        System.out.println("RECURSION APPROACH : " + Recursion(n));
    }

    public static int Recursion(int n)
    {
        if (n == 0)
        {
            return 0;
        }

        if (n == 1)
        {
            return 1;
        }

        return n * Recursion(n-1);
    }

    public static int TopDown(int n, Vector<Integer> Dp)
    {
        if (n == 0)
        {
            return 0;
        }

        if (n == 1)
        {
            return 1;
        }

        if (Dp.get(n) != -1)
        {
            return Dp.get(n);
        }

        Dp.set(n, n * TopDown(n-1,Dp));

        return Dp.get(n);
    }
}
