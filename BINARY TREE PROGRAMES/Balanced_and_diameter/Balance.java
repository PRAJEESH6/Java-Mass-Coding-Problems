package Balanced_and_diameter;

public class Balance {
    public static void main(String args[])
    {
        System.out.println("Welcome Binary Tree World Prajeesh...");

        Sub_Balance BinaryTree = new Sub_Balance();

        BinaryTree.BinaryTrees(70);

        BinaryTree.InsertTree(50);
        BinaryTree.InsertTree(100);
        BinaryTree.InsertTree(1);
        BinaryTree.InsertTree(33);
        BinaryTree.InsertTree(2000);
        BinaryTree.InsertTree(5000);

        System.out.println(" ");
        System.out.println("***************** TRAVERSAL METHODS ******************");
        System.out.println(" ");

        Sub_Balance.PreOrder(BinaryTree.Root);
        System.out.println(" ");
        Sub_Balance.InOrder(BinaryTree.Root);
        System.out.println(" ");
        Sub_Balance.PostOrder(BinaryTree.Root);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("***************** DATA AVAILABLE METHODS ******************");
        System.out.println(" ");

        if (BinaryTree.SearchNode(BinaryTree.Root, 5000) == null)
        {
            System.out.println("..Sorry Your Data Not Available in the Database...");
        }else{
            System.out.println("...Your data is Available in the Database...");
        }

        System.out.println(" ");
        System.out.println("***************** ZIGZAC TRAVERSAL METHODS ******************");
        System.out.println(" ");

        BinaryTree.ZigZacTraversal(BinaryTree.Root);

        System.out.println(" ");
        System.out.println("***************** RANGE LIMIT METHODS ******************");
        System.out.println(" ");

        BinaryTree.RangeLimit(BinaryTree.Root,100,20000);
    }
}
