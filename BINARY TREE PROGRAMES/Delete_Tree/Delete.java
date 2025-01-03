package Delete_Tree;

public class Delete {
    public static void main(String args[])
    {
        System.out.println("WELCOME BINARY TREE WORLD PRAJEESH..");

        Delete_Sub binaryTree = new Delete_Sub();

        binaryTree.BinaryRoot(50);

        binaryTree.InsertAtLeft(binaryTree.Root, 40);
        binaryTree.InsertAtRight(binaryTree.Root, 90);

        binaryTree.InsertAtLeft(binaryTree.Root.left, 39);
        binaryTree.InsertAtLeft(binaryTree.Root.right, 45);

        binaryTree.InsertAtRight(binaryTree.Root.left, 70);
        binaryTree.InsertAtRight(binaryTree.Root.right, 120);

        binaryTree.InsertAtLeft(binaryTree.Root.left.left, 20);
        binaryTree.InsertAtLeft(binaryTree.Root.right.right, 100);

        binaryTree.InsertAtRight(binaryTree.Root.left.left, 76);
        binaryTree.InsertAtRight(binaryTree.Root.right.right, 150);

        binaryTree.PreOrder(binaryTree.Root);
        System.out.println(" ");
        binaryTree.InOrder(binaryTree.Root);
        System.out.println(" ");
        binaryTree.PostOrder(binaryTree.Root);
        System.out.println(" ");

        binaryTree.Delete_Node(binaryTree.Root, 90);
        System.out.println("*******");
        binaryTree.InOrder(binaryTree.Root);
    }
}
