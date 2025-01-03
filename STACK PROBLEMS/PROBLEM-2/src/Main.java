public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH");

        NewStack stack = new NewStack();

        stack.push_Process("}");
        stack.push_Process("}");

        System.out.println(" ");
        stack.Pop_Process();

        System.out.println(" ");
        stack.Peek_Data();

        String f = "{ { }";
        stack.Paraenthesis_Checker(f);
    }
}