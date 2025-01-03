package Height_BT;

import com.sun.source.tree.BinaryTree;

public class Height_BT {
    public static void main(String args[])
    {
        System.out.println("HELLO BINARY TREE WORLD PRAJEESH");

        Height_Sub binaryTree = new Height_Sub();

        binaryTree.BinaryTree(10);

        binaryTree.InsertLeft(binaryTree.Root,20);
        binaryTree.InsertRight(binaryTree.Root, 30);

        binaryTree.InsertLeft(binaryTree.Root.left,35);
        binaryTree.InsertLeft(binaryTree.Root.right, 23);

        binaryTree.InsertRight(binaryTree.Root.left, 40);
        binaryTree.InsertRight(binaryTree.Root.right, 50);

        Height_Sub.PreOrder(binaryTree.Root);
        System.out.println(" ");
        Height_Sub.InOrder(binaryTree.Root);
        System.out.println(" ");
        Height_Sub.PostOrder(binaryTree.Root);
        System.out.println(" ");

        binaryTree.Height_BT(binaryTree.Root);
    }
}
