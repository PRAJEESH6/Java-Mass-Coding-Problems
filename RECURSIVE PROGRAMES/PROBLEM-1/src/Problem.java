import java.util.Scanner;

public class Problem {
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH Coding World....");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number it should be less than 10 or 10");
        int user_input = in.nextInt();
        int intial = 0;

        System.out.println("Enter Your Name");
        String user_name = in.next();

        if (user_input <= 10)
        {
            Recursion(user_input,intial,user_name);
        }else {
            System.out.println("You give Misappropriate Number please try after some time...");
            System.exit(1);
        }


    }

    static void Recursion(int user_input,int intial,String user_name)
    {
       if (intial == user_input)
       {
          System.exit(1);
       }else {
           System.out.println(user_name);
           intial++;
           Recursion(user_input,intial,user_name);
       }
    }
}
