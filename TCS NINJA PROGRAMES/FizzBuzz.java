import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String args[])
    {
        System.out.println("Welcome Prajeesh....");
        System.out.println("********************");
        List<String> array = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Your Number...");
        int n = in.nextInt();

        for (int i=1;i<=n;i++)
        {
            boolean DivisibleBy3 = (i % 3 == 0);
            boolean DivisibleBy5 = (i % 5 == 0);

            if (DivisibleBy3 && DivisibleBy5)
            {
                array.add("FIZZBUZZ");

            } else if (DivisibleBy3) {

                array.add("FIZZ");

            } else if (DivisibleBy5) {

                array.add("BUZZ");

            }else {

                array.add(Integer.toString(i));
            }
        }

        System.out.println("Answer is >>> " + array);
    }
}
