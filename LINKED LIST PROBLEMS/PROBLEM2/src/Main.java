public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        SubClass list = new SubClass();

        list.InsertAtEnd(100);
        list.InsertAtEnd(200);
        list.InsertAtEnd(300);
        list.InsertAtEnd(400);
        list.InsertAtEnd(500);
        list.Display();

        list.DeleteAtPos(200);
        list.Display();

    }
}