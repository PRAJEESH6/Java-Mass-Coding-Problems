package IDONTICAL_bt;

public class Idontical {
    public static void main(String args[])
    {
        System.out.println("WELCOME BINARY WORLD PRAJEESH... ");

        Idontial_Sub binaryTree = new Idontial_Sub();
        Idontial_Sub binaryTree1 = new Idontial_Sub();

        binaryTree.BinaryTree(10);
        binaryTree.InsertLeft(binaryTree.Root, 15);
        binaryTree.InsertRight(binaryTree.Root,25);

        binaryTree.InsertLeft(binaryTree.Root.left, 49);
        binaryTree.InsertLeft(binaryTree.Root.right, 56);

        binaryTree.InsertRight(binaryTree.Root.left, 89);
        binaryTree.InsertRight(binaryTree.Root.right,99);

        Idontial_Sub.PreOrder(binaryTree.Root);
        System.out.println(" ");
        Idontial_Sub.InOrder(binaryTree.Root);
        System.out.println(" ");
        Idontial_Sub.PostOrder(binaryTree.Root);
        System.out.println(" ");

        binaryTree1.SecondTree(10);

        binaryTree1.InsertLefts(binaryTree1.root, 15);
        binaryTree1.InsertRights(binaryTree1.root, 25);

        binaryTree1.InsertLefts(binaryTree1.root.left,49);
        binaryTree1.InsertLefts(binaryTree1.root.right, 56);

        binaryTree1.InsertRights(binaryTree1.root.left,89);
        binaryTree1.InsertRights(binaryTree1.root.right, 99);

        System.out.println("******** SECOND TREE ********** ");
        Idontial_Sub.PreOrders(binaryTree1.root);
        System.out.println(" ");
        Idontial_Sub.InOrders(binaryTree1.root);
        System.out.println(" ");
        Idontial_Sub.PostOrders(binaryTree1.root);
        System.out.println(" ");

        Idontial_Sub.Idontial_Tree(binaryTree.Root, binaryTree1.Root);
    }
}
