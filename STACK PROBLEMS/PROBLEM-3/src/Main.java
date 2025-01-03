import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH...");

        Stack<Character> stack = new Stack<>();

        Scanner in = new Scanner(System.in);

        System.out.println("ENTER YOUR STRING WORDS : ");
        String horse = in.nextLine();

        String news = horse;

        for(int i=0;i<=news.length()-1;i++)
        {
            stack.push(news.charAt(i));
        }

        while( stack != null)
        {
            System.out.print(stack.pop() + " ");
        }


        sTACK list = new sTACK();

        list.PushOperation("Prajeesh");

        while (list != null)
        {
            System.out.println(list.PopOperation());
        }
    }
}