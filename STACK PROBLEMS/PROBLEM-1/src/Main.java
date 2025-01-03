public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! PRAJEESH");

        System.out.println(" ");
        System.out.println("ARRAY METHOD APPROACH...");
        System.out.println(" ");

        Array array = new Array();

        array.push(1000);
        array.push(2000);
        array.push(3000);
        array.push(4000);
        array.push(5000);
        array.push(6000);
        array.push(7000);
        array.push(8000);

        array.pop();
        array.pop();

        array.peek();

        System.out.println(" ");
        System.out.println("LINKED LIST APPROACH...");
        System.out.println(" ");

        Linked_List list = new Linked_List();

        list.PushData(100);
        list.PushData(200);
        list.PushData(300);
        list.PushData(400);
        list.PushData(500);

        list.Display();

        list.PopData();
        list.Display();

        list.PeekData();
        list.Display();
    }
}