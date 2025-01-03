package Expository;

public class SecondSub {

    Node head;

    class Node{
        int data;
        Node pointer;

        Node(int val)
        {
            data = val;
            pointer = null;
        }
    }

    SecondSub()
    {
        head = null;
    }

    public void InsertBegining(int val)
    {
        Node newNode = new Node(val);

        if (head == null)
        {
            head = newNode;
        }else {
            newNode.pointer = head;
            head = newNode;
        }
    }

    public void Display()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.pointer;
        }
    }
}
