package Level_Bt;

public class LevelOne {
    public static void main(String args[])
    {
        System.out.println("WELCOME PRAJEESH TCS WELCOMED YOU...");

        LevelTwo BinaryTree = new LevelTwo();

        BinaryTree.BinaryTree(10);
        BinaryTree.InsertNode(35);
        BinaryTree.InsertNode(20);
        BinaryTree.InsertNode(15);
        BinaryTree.InsertNode(56);
        BinaryTree.InsertNode(1);
        BinaryTree.InsertNode(100);

        System.out.println(" ");
        System.out.println("PREORDER METHOD");
        LevelTwo.Preorder(BinaryTree.Root);

        System.out.println(" ");
        System.out.println("INORDER METHOD");
        LevelTwo.InOrder(BinaryTree.Root);

        System.out.println(" ");
        System.out.println("POSTORDER METHOD");
        LevelTwo.PostOrder(BinaryTree.Root);

        System.out.println(" ");
        if (BinaryTree.Search(BinaryTree.Root,1000) != null)
        {
            System.out.println("Database Contains Your Data...");
        }else {
            System.out.println("Sorry Database Don't have Your Data...");
        }
    }
}
