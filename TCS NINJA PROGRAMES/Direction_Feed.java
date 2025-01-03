import java.util.Scanner;

public class Direction_Feed {
    public static void main(String args[])
    {
        System.out.println("WELCOM TCS NINJA PRAJEESH...");
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER");
        int n = in.nextInt();

        int distance = 10;
        int x = 0;
        int y = 0;
        char c = 'R';

        while (n > 0)
        {
            switch (c)
            {
                case 'R' :
                    x = x + distance;
                    distance = distance + 10;
                    c = 'U';
                    break;

                case 'U' :
                    y = y + distance;
                    distance = distance + 10;
                    c = 'L';
                    break;

                case 'L' :
                    x = x - distance;
                    distance = distance + 10;
                    c = 'D';
                    break;

                case 'D' :
                    y = y - distance;
                    distance = distance + 10;
                    c = 'A';
                    break;

                case 'A' :
                    x = x + distance;
                    distance = distance + 10;
                    c = 'R';
                    break;
            }
            n--;
        }
        System.out.println(" X "+ x +","+" Y " +y);
    }
}
