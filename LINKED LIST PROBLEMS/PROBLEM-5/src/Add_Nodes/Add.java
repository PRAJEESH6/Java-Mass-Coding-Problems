package Add_Nodes;

public class Add {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");

        Add_Sub LinkedList = new Add_Sub();
        Add_Too LinkedList1 = new Add_Too();

        LinkedList.InsertAtFirst(100);
        LinkedList.InsertAtFirst(200);
        LinkedList.InsertAtFirst(300);
        LinkedList.InsertAtFirst(400);
        LinkedList.InsertAtFirst(500);

        LinkedList1.InsertAtBegining(10);
        LinkedList1.InsertAtBegining(20);
        LinkedList1.InsertAtBegining(30);
        LinkedList1.InsertAtBegining(40);
        LinkedList1.InsertAtBegining(50);

        LinkedList.Display();
        System.out.println(" ");

        LinkedList1.DISPLAY();
        System.out.println(" ");

        LinkedList1.Add_Nodes(LinkedList.head,LinkedList1.HEAD);

        LinkedList1.DISPLAY();
        System.out.println(" ");
    }
}
