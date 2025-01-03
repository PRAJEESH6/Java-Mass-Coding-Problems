package BINARY_SEARCH_TREE;

public class Binary_Sub {

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

    public void BinaryTree(int val)
    {
        Root = new Node(val);
    }

    public void InsertLeft(Node node,int val)
    {
        Node newNode = new Node(val);
        node.left = newNode;
    }

    public void InsertRight(Node node,int val)
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

    public static void PostOrder(Node node)
    {
        if (node != null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public Node Binary_Insert(Node node,int key)
    {
        if (node == null)
        {
            return new Node(key);
        }

        if (key < node.data)
        {
            return node.left = Binary_Insert(node.left,key);
        }else {
            return node.right = Binary_Insert(node.right,key);
        }

    }

    public boolean Symmetric_Tree(Node one,Node two)
    {
        if (one == null && two == null)
        {
           System.out.println("TRUE");
           System.exit(1);
        }

        if (one == null || two == null)
        {
            System.out.println("FALSE");
            System.exit(1);
        }

        if (one.data != two.data)
        {
            System.out.println("FALSE");
            System.exit(1);
        }

        return Symmetric_Tree(one.left,two.right) && Symmetric_Tree(one.right,one.left);
    }

    public Node Search(Node node,int val)
    {
         if (node == null || node.data == val)
         {
             return node;
         }

         if (val < node.data)
         {
             return Search(node.left,val);
         }

         return Search(node.right,val);
    }
}
