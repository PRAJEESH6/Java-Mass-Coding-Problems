public class Linked {

    Node head;

    class Node{
        String data;
        Node pointer;
        Node(String val)
        {
            data = val;
            pointer = null;
        }
    }

    Linked(){
        head = null;
    }

    public void InsertAtBegining(String val)
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
            System.out.print(temp.data + " ");
            temp = temp.pointer;
        }
    }

    public Boolean IsPalindrome() {
        Node slow;
        Node fast;
        Node temp = head;

//        while (temp != null)
//        {
//            slow = slow.pointer;
//            fast = fast.pointer.pointer;
//            temp = temp.pointer;
//        }
//
//        ReverseLink recerse(slow);

//        if(recerse.data != head.data)
//        {
//            return false;
//
//        }else{
//            recerse.pointer;
//            head.pointer;
//        }


        return null;
    }

    public void ReverseLink(){

    }
}
