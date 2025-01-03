public class List2 {

    Node head;

    class Node {
        int data;
        Node pointer;

        Node(int val) {
            data = val;
            pointer = null;
        }
    }

    List2()
    {
        head = null;
    }

         public void InsertAtBegining(int val)
         {
             Node newNode = new Node(val);

             if(head == null)
             {
                 head = newNode;
             }else{
                 newNode.pointer = head;
                 head = newNode;
             }
         }


    public void Dispaly2()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.pointer;
        }
    }

    public void DeleteAtEnd()
    {

    }

    public void DeleteAtPos(int pos )
    {
        Node temp = head;

       for(int i=0;i<=pos;i++)
       {

       }
    }

    public void InsertAtPos()
    {

    }
}
