public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH");

        SubClass links = new SubClass();

        links.InsertAtBegining(0);
        links.InsertAtBegining(2);
        links.InsertAtBegining(2);
        links.InsertAtBegining(1);
        links.InsertAtBegining(0);
        links.InsertAtBegining(0);
        links.InsertAtBegining(2);

        links.Display();

        System.out.println(" ");
        links.SortedLists();
        links.Display();
    }
}