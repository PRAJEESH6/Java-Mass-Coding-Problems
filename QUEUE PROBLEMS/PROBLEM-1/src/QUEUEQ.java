public class QUEUEQ {

    class Node{
        int data;
        Node pointer;

        Node(int val)
        {
            data = val;
            pointer = null;
        }
    }

    Node front, rear;

    QUEUEQ()
    {
        front = null;
        rear  = null;
    }

    public void Enqueue(int val)
    {
        Node newNode = new Node(val);

        if (front == null)
        {
             front = newNode;
        }else{
             rear.pointer = newNode;
             rear = newNode;
        }
    }


    public int Dequeue()
    {
        int temp = front.data;
        front = front.pointer;

        if (front == null)
        {
            rear = null;
        }

        return temp;
    }


}
