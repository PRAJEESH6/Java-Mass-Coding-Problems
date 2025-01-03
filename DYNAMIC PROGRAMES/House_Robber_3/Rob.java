package House_Robber_3;

import java.util.Arrays;

public class Rob {

    Node Root;

    class Node{
        Node Left;
        Node Right;
        int data;
        int Height;

        Node(int val)
        {
            Left = null;
            Right = null;
            data = val;
            Height = 0;
        }
    }

    public void BinaryRobbery(int val)
    {
        Root = new Node(val);
    }

    public void BinaryRobbery()
    {
        Root = null;
    }

    public void InsertNode(int val)
    {
     Root = InsertNode(Root,val);
    }
    public Node InsertNode(Node node, int val)
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

    public int roob(Node node)
    {
        int[] Options = HouseMoney(node);
        return Math.max(Options[0],Options[1]);
    }

    public int[] HouseMoney(Node node)
    {
        if (node == null)
        {
            return new int[2];
        }

        int[] Left_Node_Choices = HouseMoney(node.Left);
        int[] Right_Node_Choices = HouseMoney(node.Right);
        int[] Optoins = new int[2];

        System.out.println("Left" + Arrays.toString(Left_Node_Choices));
        System.out.println(" Right"+Arrays.toString(Right_Node_Choices));
        System.out.println("Options"+Arrays.toString(Optoins));

        Optoins[0] = node.data + Left_Node_Choices[1] + Right_Node_Choices[1];
        Optoins[1] = Math.max(Left_Node_Choices[0],Left_Node_Choices[1]) + Math.max(Right_Node_Choices[0],Right_Node_Choices[1]);

        System.out.println(Arrays.toString(Optoins));
        return Optoins;
    }
}
