public class Linked_List {

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

    Linked_List(){
        head = null;
    }

    public void PushData(int val)
    {
        Node newNode = new Node(val);

        if(head == null)
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

        while (temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.pointer;
        }
    }

    public void PopData()
    {
        if (head == null)
        {
            throw new IndexOutOfBoundsException("Linked List is Empty...");
        }else{
            int praju = head.data;
            head = head.pointer;
            System.out.println("YOUR POPPED DATA IS : " + praju);
        }
    }

    public void PeekData()
    {
        if (head == null)
        {
            throw new IndexOutOfBoundsException("Linked List is Empty...");
        }else{
            System.out.println("YOUR PEEK DATA IS : " + head.data);
        }
    }
}
