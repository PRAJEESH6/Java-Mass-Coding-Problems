
//index  - 1     2    3    4    5    6    7    8    9    10

//values - 0     0    2    1    4    2    6    3    8     4

import java.util.Scanner;

public class Number_Series {
    public static void main(String args[])
    {
        System.out.println("Welcome Prajeesh..");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Index Number..");
        int n = in.nextInt();
        if (n <= 10)
        {

        }else {
            System.out.println("Please give Valid Array Index Numbers...");
            System.exit(1);
        }
        int a = 0;
        int b = 0;

        for (int i=1;i<=n;i++)
        {
            if (i % 2 != 0)
            {
                if (i > 1)
                {
                    a = a + 2;
                }
            } else {

                b =a/2;
            }
        }

        if (n % 2 != 0)
        {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
