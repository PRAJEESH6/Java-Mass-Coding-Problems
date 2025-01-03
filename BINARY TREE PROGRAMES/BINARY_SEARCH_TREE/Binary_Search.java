package BINARY_SEARCH_TREE;

public class Binary_Search {
    public static void main(String args[])
    {
        System.out.println("WELCOME BINARY SEARCH WORLD PRAJEESH..");

        Binary_Sub binaryTree = new Binary_Sub();

        binaryTree.BinaryTree(100);
        binaryTree.InsertLeft(binaryTree.Root,70);
        binaryTree.InsertRight(binaryTree.Root, 500);

        binaryTree.InsertLeft(binaryTree.Root.left, 60);
        binaryTree.InsertLeft(binaryTree.Root.right,80 );

        binaryTree.InsertRight(binaryTree.Root.left, 400);
        binaryTree.InsertRight(binaryTree.Root.right, 800);

        Binary_Sub.PreOrder(binaryTree.Root);
        System.out.println(" ");
        Binary_Sub.InOrder(binaryTree.Root);
        System.out.println(" ");
        Binary_Sub.PostOrder(binaryTree.Root);
        System.out.println(" ");

//        binaryTree.Binary_Insert(binaryTree.Root, 550);
//        System.out.println("***** ");
//        Binary_Sub.InOrder(binaryTree.Root);
//        System.out.println(" ");

        binaryTree.Symmetric_Tree(binaryTree.Root.left, binaryTree.Root.right );

        if (binaryTree.Search(binaryTree.Root,500) == null)
        {
            System.out.println("NOT FOUND");
        }else {
            System.out.println("FOUNDED..");
        }

    }
}
