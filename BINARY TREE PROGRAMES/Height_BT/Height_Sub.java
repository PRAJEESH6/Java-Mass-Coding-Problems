package Height_BT;

public class Height_Sub {

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

    public void BinaryTree(int value)
    {
        Root = new Node(value);
    }

    public void InsertLeft(Node Left_Node,int val)
    {
        Node newNode = new Node(val);
        Left_Node.left = newNode;
    }

    public void InsertRight(Node Right_Node,int val)
    {
        Node newNode = new Node(val);
        Right_Node.right = newNode;
    }

    public static void PreOrder(Node preOrderNode)
    {
        if (preOrderNode != null) {
            System.out.print(preOrderNode.data + " ");
            PreOrder(preOrderNode.left);
            PreOrder(preOrderNode.right);
        }
    }

    public static void InOrder(Node inOrderNode)
    {
        if (inOrderNode != null)
        {
            InOrder(inOrderNode.left);
            System.out.print(inOrderNode.data + " ");
            InOrder( inOrderNode.right);
        }
    }

    public static void PostOrder(Node postOrderNode)
    {
        if (postOrderNode != null)
        {
            PostOrder(postOrderNode.left);
            PostOrder(postOrderNode.right);
            System.out.print(postOrderNode.data + " ");
        }
    }

    public int Height_BT(Node binaryNode)
    {
       if (binaryNode == null)
       {
           System.out.println("The Node is Null...");
           System.exit(1);
       }else {

           int left = Height_BT(binaryNode.left);
           int right = Height_BT(binaryNode.right);

           if (left > right)
           {
               System.out.println("HEIGHT OF THIS TREE IS :: " + left + 1);
           }else {
               System.out.println("HEIGHT OF THIS TREE IS :: " + right + 1);
           }
       }
        return 0;
    }


}
