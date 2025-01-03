package Balanced_and_diameter;

import java.util.*;

public class Sub_Balance {

    Node Root;

    class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int val){
            data = val;
            left = null;
            right = null;
            height = 0;
        }
    }

    public void BinaryTrees(int val)
    {
        Root = new Node(val);
    }

    public void BinaryTrees()
    {
        Root = null;
    }

    public int GetHeight(Node node)
    {
       if (node == null)
       {
           return -1;
       }

       return node.height;
    }

    public int Maximum(int a, int b)
    {
        return a < b ? b : a;
    }

    public int Balance_Factor(Node node)
    {
        if (node == null)
        {
            return 0;
        }

        return GetHeight(node.left) - GetHeight(node.right);
    }

    public void InsertTree(int val)
    {
       Root = InsertTree(Root,val);
    }

    public Node InsertTree(Node node, int val)
    {
        if (node == null)
        {
            return new Node(val);
        }

        if (val < node.data)
        {
            node.left = InsertTree(node.left,val);

        } else if (val > node.data) {

            node.right = InsertTree(node.right,val);

        }else {
            return node;
        }

        node.height = 1 + Maximum(GetHeight(node.left), GetHeight(node.right));

        int Bal_Fac = Balance_Factor(node);

        //left left case

        if (Bal_Fac > 1 && val < node.left.data)
        {
            return RightRotate(node);
        }

        //left right case

        if (Bal_Fac > 1 && val > node.left.data)
        {
            node.left = LeftRotate(node.left);
             return RightRotate(node);
        }

        //right right case

        if (Bal_Fac < 1 && val > node.right.data)
        {
            return LeftRotate(node);
        }

        //right left case

        if (Bal_Fac < 1 && val < node.right.data)
        {
            node.right = RightRotate(node.right);
            return LeftRotate(node);
        }

        return node;
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

    public static void PostOrder(Node node) {
        if (node != null)
        {
            PostOrder(node.left);
            PostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public Node SearchNode(Node node,int val)
    {
        if (node == null || node.data == val)
        {
            return node;
        }

        if (val < node.data)
        {
            return SearchNode(node.left,val);
        }

        return SearchNode(node.right,val);
    }

    public Node LeftRotate(Node Z)
    {
       Node Y = Z.right;
       Node t3 = Y.left;

       Y.left = Z;
       Z.right = t3;

       Z.height = 1 + Maximum(GetHeight(Z.left), GetHeight(Z.right));
       Y.height = 1 + Maximum(GetHeight(Y.left), GetHeight(Y.right));

       return Y;
    }

    public Node RightRotate(Node Z)
    {
        Node Y = Z.left;
        Node t3 = Y.right;

        Y.right = Z;
        Z.left = t3;

        Z.height = 1 + Maximum(GetHeight(Z.left), GetHeight(Z.right));
        Y.height = 1 + Maximum(GetHeight(Y.left), GetHeight(Y.right));

        return Y;
    }

    List<List<Integer>> ZigZacTraversal(Node node)
    {
        List <List<Integer>> MainZigZac = new ArrayList<>();

        if (node == null)
        {
            return MainZigZac;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        boolean flags = false;

        while(!queue.isEmpty())
        {
            int size = queue.size();

            List <Integer> level = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();

            for (int i=0;i<size;i++)
            {
                Node nodes = queue.poll();

                if (flags)
                {
                    stack.push(nodes.data);

                }else{

                    level.add(nodes.data);
                }

                if (nodes.left != null)
                {
                    queue.add(nodes.left);
                }

                if (nodes.right != null)
                {
                    queue.add(nodes.right);
                }
            }

            flags = !flags;

            while (!stack.isEmpty())
            {
                level.add(stack.pop());
            }

            MainZigZac.add(level);
        }

        System.out.println(MainZigZac);
        return MainZigZac;
    }

    public int RangeLimit(Node node,int low,int high)
    {
        if (node == null)
        {
            return 0;
        }

        int sum = 0;

        if (node.data > low)
        {
            sum += RangeLimit(node.left,low,high);
        }

        if (node.data >= low && node.data <= high)
        {
            sum += node.data;
        }

        if (node.data < high)
        {
            sum += RangeLimit(node.right,low,high);
        }

        System.out.println("RangeLimit is : " + sum);
        return sum;
    }
}
