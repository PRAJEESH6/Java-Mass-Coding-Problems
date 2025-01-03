public class SubClass {

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

    SubClass(){
        head = null;
    }

    public void InsertAtEnd(int val)
    {
        Node newNode = new Node(val);
        Node temp = head;

        if(head == null)
        {
           head = newNode;
        }else {

          while (temp.pointer != null)
          {
              temp = temp.pointer;
          }

          temp.pointer = newNode;
        }
    }

    public void Display()
    {
        Node temp = head;

        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.pointer;
        }
    }


    public void CircularLinkedList()
    {
        Node circular = head;

        while (circular.pointer != null)
        {
            circular = circular.pointer;
        }

        circular.pointer = head;
    }

    public void DeleteAtPos(int pos)
    {
        Node delete = head;
        Node prev = null;

        if(head == null)
        {
            System.exit(0);
        }

        for(int i=0;i<=pos;i++)
        {
            prev = delete;
            delete = delete.pointer;
        }

        prev.pointer = delete.pointer;

    }
}
