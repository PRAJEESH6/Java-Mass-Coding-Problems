package AVL_TREE;

public class Avl_Impl {

    Node Root;

    class Node{
        int data;
        int height;
        Node Left;
        Node Right;

        Node(int val)
        {
            data = val;
            height = 0;
            Left = null;
            Right = null;
        }
    }

    public void BinaryTree(int val)
    {
       // Root = new newNode(val);
    }

    public void BinaryTree()
    {
        Root = null;
    }
}
