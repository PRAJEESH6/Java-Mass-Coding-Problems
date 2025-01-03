package Level_Bt;

public class LevelTwo {

    Node Root;

    class Node{
        int data;
        Node Right;
        Node Left;
        int Height;

        Node(int val)
        {
            data = val;
            Right = null;
            Left = null;
            Height = 0;
        }
    }

    public void BinaryTree(int val)
    {
        Root = new Node(val);
    }

    public void BinaryTree()
    {
        Root = null;
    }

    public int Maximum(int a,int b)
    {
        return a > b ? a : b;
    }

    public int FindHeight(Node node)
    {
       if (node == null)
       {
           return -1;
       }

       return node.Height;
    }

    public int GetBalanceFactor(Node node)
    {
        if (node == null)
        {
            return 0;
        }

        return FindHeight(node.Left) - FindHeight(node.Right);
    }

    public void InsertNode(int val)
    {
        Root = InsertNode(Root,val);
    }

    public Node InsertNode(Node node,int val)
    {
        if (node == null)
        {
            return new Node(val);
        }

        if (val > node.data)
        {
            node.Right = InsertNode(node.Right,val);

        } else if (val < node.data) {

            node.Left = InsertNode(node.Left,val);

        }else {

            return node;
        }

        node.Height = 1 + Maximum(FindHeight(node.Left),FindHeight(node.Right));

        int Factor = GetBalanceFactor(node);

        if (Factor > 1 && val < node.Left.data)
        {
           return RightRotate(node);
        }

        if (Factor > 1 && val > node.Left.data)
        {
            node.Left = LeftRotate(node.Left);
            return RightRotate(node);
        }

        if (Factor < -1 && val > node.Right.data)
        {
           return LeftRotate(node);
        }

        if (Factor < -1 && val < node.Right.data)
        {
            node.Right = RightRotate(node.Right);
            return LeftRotate(node);
        }

        return node;
    }

    public static void Preorder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.data + " ");
            Preorder(node.Left);
            Preorder(node.Right);
        }
    }

    public static void InOrder(Node node)
    {
        if (node != null)
        {
            InOrder(node.Left);
            System.out.print(node.data + " ");
            InOrder(node.Right);
        }
    }

    public static void PostOrder(Node node)
    {
        if (node != null)
        {
            PostOrder(node.Left);
            PostOrder(node.Right);
            System.out.print(node.data +" ");
        }
    }

    public Node Search(Node node,int val)
    {
        if (node == null || node.data == val)
        {
            return node;
        }

        if (val > node.data)
        {
            return Search(node.Right,val);
        }

        return Search(node.Left,val);
    }

    public Node RightRotate(Node Z)
    {
        Node Y = Z.Left;
        Node t3 = Y.Right;

        Y.Right = Z;
        Z.Left = t3;

        Z.Height = 1 + Maximum(FindHeight(Z.Left),FindHeight(Z.Right));
        Y.Height = 1 + Maximum(FindHeight(Y.Left),FindHeight(Y.Right));

        return Y;
    }

    public Node LeftRotate(Node Z)
    {
        Node Y = Z.Right;
        Node t3 = Y.Right;

        Y.Left = Z;
        Z.Right = t3;

        Z.Height = 1 + Maximum(FindHeight(Z.Left),FindHeight(Z.Right));
        Y.Height = 1 + Maximum(FindHeight(Y.Left),FindHeight(Y.Right));

        return Y;
    }
}
