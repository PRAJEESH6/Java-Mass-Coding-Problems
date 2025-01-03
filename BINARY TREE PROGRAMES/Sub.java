public class Sub {

    Node Root;

    class Node{
        int data;
        Node left;
        Node right;

        Node(int val)
        {
            data = val;
            left = null;
            right = null;
        }
    }

    public void BinaryRoot(int val)
    {
        Root = new Node(val);
    }

    public void InsertLeft(Node node,int val)
    {
        Node newNode = new Node(val);
        node.left = newNode;
    }

    public void InsertRight(Node node, int val)
    {
      Node newNode = new Node(val);
      node.right = newNode;
    }

    public static void PreOrder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.data + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }

    }

    public static void InOrder(Node node)
    {
        if (node != null)
        {
            InOrder(node.left);
            System.out.print(node.data + " ");
            InOrder(node.right);
        }
    }

    public static  void PostOrder(Node node)
    {
        if (node != null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
