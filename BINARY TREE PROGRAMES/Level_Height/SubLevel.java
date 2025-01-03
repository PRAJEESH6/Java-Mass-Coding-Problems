package Level_Height;

import AVL_TREE.AVl_Impl;

import java.util.LinkedList;
import java.util.Queue;

public class SubLevel {

    Node Root;

    class Node{
        int data;
        int Height;
        Node Left;
        Node Right;

        Node(int val)
        {
            data = val;
            Height = 0;
            Left = null;
            Right = null;
        }
    }

    public SubLevel(int val)
    {
        Root = new Node(val);
    }

    public SubLevel()
    {
        Root = null;
    }

    public void InsertTreeNodes(int val)
    {
        Root = InsertTreeNodes(Root,val);

    }

    private int Height(Node node)
    {
        if (node == null)
        {
            return -1;
        }

        return node.Height;
    }

    private int Maximum(int A, int B)
    {
       return A > B ? A : B;
    }

    private int BalanceFactor(Node node)
    {
       if (node == null)
       {
           return 0;
       }

       return Height(node.Left) - Height(node.Right);
    }


    public Node InsertTreeNodes(Node node,int val)
    {
        if (node == null)
        {
            return new Node(val);
        }

        if (node.data < val)
        {
            node.Left = InsertTreeNodes(node.Left,val);

        } else if (node.data > val) {

            node.Right = InsertTreeNodes(node.Right,val);
        }
        else {
            return node;
        }

        node.Height = 1 + Maximum(Height(node.Left),Height(node.Right));

        int BalancedFac = BalanceFactor(node);

        if (BalancedFac > 1 && val < node.Left.data)
        {
            return RightRotate(node);
        }

        if (BalancedFac > 1 && val > node.Left.data)
        {
            node.Left = LeftRotate(node.Left);
            return RightRotate(node);
        }

        if (BalancedFac < -1 && val > node.Right.data)
        {
            return LeftRotate(node);
        }

        if (BalancedFac < -1 && val < node.Right.data)
        {
           node.Right = RightRotate(node.Right);
           return LeftRotate(node);
        }

        return node;
    }

    public static void PreOrder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.data + " ");
            PreOrder(node.Left);
            PreOrder(node.Right);
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
            System.out.print(node.data + " ");
        }
    }

    public Node Search(Node node,int val)
    {
        if (node == null || node.data == val)
        {
            return node;
        }

        if (val < node.data)
        {
            return Search(node.Left,val);
        }

        return Search(node.Right,val);
    }
//    private Node RightRotate(Node Z)
//    {
//        Node Y = Z.Left;
//        Node T3 = Y.Right;
//
//        Y.Right = Z;
//        Z.Left = T3;
//
//        Z.Height = 1 + Maximum(Height(Z.Left), Height(Z.Right));
//        Y.Height = 1 + Maximum(Height(Y.Left), Height(Y.Right));
//
//        return Y;
//    }
//
//    private Node LeftRotate(Node Z)
//    {
//        Node Y = Z.Right;
//        Node T3 = Y.Left;
//
//        Y.Left = Z;
//        Z.Right = T3;
//
//        Z.Height = 1 + Maximum(Height(Z.Left), Height(Z.Right));
//        Y.Height = 1 + Maximum(Height(Y.Left), Height(Y.Right));
//
//        return Y;
//    }

    private Node RightRotate(Node Z)
    {
        Node Y = Z.Left;
        Node T3 = Y.Right;

        Y.Right = Z;
        Z.Left = T3;

        Z.Height = 1 + Maximum(Height(Z.Left),Height(Z.Right));
        Y.Height = 1 + Maximum(Height(Y.Left),Height(Y.Right));

        return Y;
    }

    private Node LeftRotate(Node Z)
    {
        Node Y = Z.Right;
        Node t3 = Y.Left;

        Y.Left = Z;
        Z.Right = t3;

        Z.Height = 1 + Maximum(Height(Z.Left),Height(Z.Right));
        Y.Height = 1 + Maximum(Height(Y.Left), Height(Y.Right));

        return Y;
    }

    public int HeightOfBinaryTree(Node node)
    {
        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        int Numoflevels = -1;

        while (true)
        {
            int queueSize = queue.size();

            if (queueSize == 0)
            {
                return Numoflevels;
            }

            while (queueSize > 0)
            {
                Node node1 = queue.poll();

                if(node1.Left != null)
                {
                    queue.add(node1.Left);
                }

                if (node1.Right != null)
                {
                    queue.add(node1.Right);
                }

                queueSize--;
            }

            Numoflevels++;
        }
    }
}
