import java.util.Scanner;

public class Problem2 {
    public static void main(String args[])
    {
        System.out.println("Welcome Prajeesh...");
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR FAVORITE NUMBER");
        int user_number = in.nextInt();
        int starting = 0;

        LinearMethod(user_number,starting);
    }

    public static void LinearMethod(int user_number,int starting)
    {
        if (user_number == 0)
        {
            System.out.println("Please give Correct Value...1 to 100000000");
            System.exit(1);
        }

        if(starting <= user_number)
        {
            System.out.println(starting);
            starting++;
            LinearMethod(user_number,starting);
        }
    }

}
