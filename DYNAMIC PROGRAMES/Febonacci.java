import java.util.Collections;
import java.util.Vector;

public class Febonacci {
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH..");
        int n = 3;


        //Bottom Up Approach
        Vector<Integer> newDp = new Vector<>(Collections.nCopies(n + 1, 0));
        newDp.set(0,0);
        newDp.set(1,1);

        for (int i=2;i<=n;i++)
        {
            newDp.set(i, newDp.get(i-1) + newDp.get(i-2));
        }

        int v = newDp.get(n);
        System.out.println("Bottom Up Approach " + v);




        //TopDown Approach
        Vector<Integer> dp = new Vector<>(Collections.nCopies(n + 1, -1));
        System.out.println("Top Down Approach: " + TopDown(n, dp));

        //RECURSION APPROACH
        System.out.println("Recursion Approach " +Momoization(n));
    }

    public static int Momoization(int n )
    {
        if (n == 0)
        {
           return 0;
        }

        if (n == 1)
        {
            return 1;
        }

        return Momoization(n-1) + Momoization(n-2);
    }

    public static int TopDown(int n, Vector<Integer> dp)
    {
        if (n == 0)
        {
           return 0;
        }

        if (n == 1)
        {
          return 1;
        }

        if (dp.get(n) != -1)
        {
            return dp.get(n);
        }

         dp.set(n,TopDown(n-1,dp) + TopDown(n-2,dp));
        return dp.get(n);

    }


}
