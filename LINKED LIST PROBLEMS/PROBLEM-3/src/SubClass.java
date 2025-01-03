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

    SubClass()
    {
        head = null;
    }


    public void InsertAtBegining(int val)
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

    public void InsertAtEnd(int val)
    {
        Node newNode = new Node(val);

        if(head == null)
        {
            head = newNode;
        }else{

            Node temp = head;
            Node prev = null;

            while (temp != null)
            {
                prev = temp;
                temp = temp.pointer;
            }

            prev.pointer = newNode;
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

    public void SortedLists()
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node temp = head;

        while(temp != null)
        {
            if(temp.data == 0)
            {
                count0++;

            } else if (temp.data == 1) {

                count1++;

            }else {

                count2++;
            }

            temp = temp.pointer;
        }


        for(int i=0;i<=count0;i++)
        {
            InsertAtEnd(0);
        }

        for(int j=count0;j<count0 + count1; j++)
        {
            InsertAtEnd(1);
        }

        for(int k=count0+count1;k<count0+count1+count2;k++)
        {
            InsertAtEnd(2);
        }
    }
}
