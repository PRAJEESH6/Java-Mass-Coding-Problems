public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Linked palindrome = new Linked();

        palindrome.InsertAtBegining("m");
        palindrome.InsertAtBegining("u");
        palindrome.InsertAtBegining("k");
        palindrome.InsertAtBegining("k");
        palindrome.InsertAtBegining("u");
        palindrome.InsertAtBegining("m");

        palindrome.Display();
    }
}