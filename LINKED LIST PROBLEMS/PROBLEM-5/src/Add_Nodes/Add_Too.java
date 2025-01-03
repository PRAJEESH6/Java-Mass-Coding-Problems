package Add_Nodes;

class Add_Too {

    Node HEAD;

    class Node{
        int value;
        Node pointer;

        Node(int val)
        {
            value = val;
            pointer = null;
        }
    }

    Add_Too()
    {
        HEAD = null;
    }

    public void InsertAtBegining(int val)
    {
        Node newNode = new Node(val);

        if (HEAD == null)
        {
            HEAD = newNode;

        }else {

            newNode.pointer = HEAD;
            HEAD = newNode;
        }
    }

    public void DISPLAY()
    {
        Node temp = HEAD;

        while (temp != null)
        {
            System.out.print(temp.value + " => ");
            temp = temp.pointer;
        }
    }

    public Node Add_Nodes(Node one,Node two)
    {
        Node temp1 = one;
        Node temp2 = two;
        Node DummyNode = new Node(-1);
        Node current = DummyNode;
        int carry = 0;

        while (temp1 != null || temp2 != null)
        {
            int sum = carry;

            if (temp1 != null)
            {
                sum = sum + temp1.value;
            }

            if (temp2 != null)
            {
                sum = sum + temp2.value;
            }

            Node newNode = new Node(sum % 10);
            carry = sum % 10;

            current.pointer = newNode;
            current = current.pointer;

            if (temp1 != null)
            {
                temp1 = temp1.pointer;
            }

            if (temp2 != null)
            {
                temp2 = temp2.pointer;
            }
        }

        if (carry != -1)
        {
            Node newNode = new Node(carry);
            current.pointer = newNode;
        }

        return DummyNode.pointer;
    }
}
