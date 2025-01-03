package AVL_TREE;

public class Avl_Main {
    public static void main(String args[])
    {
        System.out.println("WELCOME AVL TREE WORLD PRAJEESH..");

        AVl_Impl BinaryTree = new AVl_Impl(50);


        BinaryTree.InsertTree(100);
        BinaryTree.InsertTree(10);
        BinaryTree.InsertTree(69);
        BinaryTree.InsertTree(30);
        BinaryTree.InsertTree(40);
        BinaryTree.InsertTree(25);
        BinaryTree.InsertTree(01);

        AVl_Impl.InOrderTraverse(BinaryTree.Root);
        System.out.println(" ");

        if (BinaryTree.Search_Nodes(BinaryTree.Root, 30) == null)
        {
            System.out.println("I'm Sorry Your Data is Not Founded...");
        }else {
            System.out.println("Your Data is Founded...");
        }
    }
}
