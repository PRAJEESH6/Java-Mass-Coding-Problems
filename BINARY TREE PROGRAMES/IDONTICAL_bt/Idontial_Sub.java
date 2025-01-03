package IDONTICAL_bt;

public class Idontial_Sub {

    Node Root;
    Node root;

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

    public void BinaryTree(int value)
    {
        Root = new Node(value);
    }

    public void InsertLeft(Node binaryNode,int data)
    {
        Node newNode = new Node(data);
        binaryNode.left = newNode;
    }

    public void InsertRight(Node binaryNode, int data)
    {
        Node newNode = new Node(data);
        binaryNode.right = newNode;
    }

    public static void PreOrder(Node node)
    {
        if (node != null) {
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

    public static void PostOrder(Node node)
    {
        if (node != null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

  //*********************************************

    class Node_One{

        int datas;
        Node_One lefts;
        Node_One rights;

        Node_One(int val)
        {
           datas = val;
           lefts = null;
           rights = null;
        }
    }

    public void SecondTree(int val)
    {
        root = new Node(val);
    }

    public void InsertLefts(Node node,int val)
    {
        Node newNode = new Node(val);
        node.left = newNode;
    }

    public void InsertRights(Node node,int val)
    {
        Node newNode = new Node(val);
        node.right = newNode;
    }

    public static void PreOrders(Node node)
    {
        if (node != null) {
            System.out.print(node.data + " ");
            PreOrders(node.left);
            PreOrders(node.right);
        }
    }

    public static void InOrders(Node node)
    {
        if (node != null)
        {
            InOrders(node.left);
            System.out.print(node.data + " ");
            InOrders(node.right);
        }
    }

    public static void PostOrders(Node node)
    {
        if (node != null)
        {
            PostOrders(node.left);
            PostOrders(node.right);
            System.out.print(node.data + " ");
        }
    }

    //***************************************************

    public static boolean Idontial_Tree(Node node_one,Node node_two)
    {
        if (node_one == null && node_two == null)
        {
            System.out.println("Node is Idontial...");
            System.exit(1);

        } else if (node_one == null || node_two == null) {
            System.out.println("Node is not Idontial...");
            System.exit(1);

        } else if (node_one.data == node_two.data)
        {
            return Idontial_Tree(node_one.left,node_two.left) && Idontial_Tree(node_one.right,node_two.right);
        }

        return false;
    }
}
