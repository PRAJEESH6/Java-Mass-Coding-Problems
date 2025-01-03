package Delete_Tree;

public class Delete_Sub {

    Node Root;

    class Node{
        int key;
        Node left;
        Node right;

        Node(int val)
        {
            key = val;
            right = null;
            left = null;
        }
    }

    public void BinaryRoot(int val)
    {
        Root = new Node(val);
    }

    public void InsertAtLeft(Node node,int val)
    {
        Node newNode = new Node(val);
        node.left = newNode;
    }

    public void InsertAtRight(Node node,int val)
    {
        Node newNode = new Node(val);
        node.right = newNode;
    }

    public void PreOrder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.key + " ");
            PreOrder(node.left);
            PreOrder(node.right);
        }
    }

    public void InOrder(Node node)
    {
        if (node != null)
        {
            InOrder(node.left);
            System.out.print(node.key + " ");
            InOrder(node.right);
        }
    }

    public void PostOrder(Node node)
    {
        if (node != null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public Node Delete_Node(Node node, int val)
    {
        if(node == null)
        {
            return node;
        }

        if (val > node.key)
        {
            node.right = Delete_Node(node.right,val);

        } else if (val < node.key) {

            node.left = Delete_Node(node.left,val);

        }else {

            if (node.right == null)
            {
                return node.left;

            }else if(node.left == null)
            {
                return node.right;
            }
        }

        return node;
    }


}
