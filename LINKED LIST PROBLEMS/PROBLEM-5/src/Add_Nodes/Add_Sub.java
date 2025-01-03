package Add_Nodes;

public class Add_Sub {

   Node head;

    class Node{
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }

    Add_Sub()
    {
        head = null;
    }

    public void InsertAtFirst(int val)
    {
        Node newNode = new Node(val);

        if (head == null)
        {
           head = newNode;

        }else {

           newNode.next = head;
           head = newNode;
        }
    }


    public void InsertAtEnd(int val)
    {
        Node newNode = new Node(val);
    }

    public void Display()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }


}
