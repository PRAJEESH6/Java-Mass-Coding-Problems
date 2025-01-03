package Expository;

public class Expository {

    Node Head;

    class Node{
        int data;
        Node pointer;

        Node(int val)
        {
            data =  val;
            pointer = null;
        }
    }

    Expository()
    {
        Head = null;
    }

    public void InsertBegin(int val)
    {
        Node newNode = new Node(val);

        if (Head == null)
        {
            Head = newNode;
        }else {
            newNode.pointer = Head;
            Head = newNode;
        }
    }

    public void Display()
    {
        Node temp = Head;

        while(temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.pointer;
        }
    }
}
