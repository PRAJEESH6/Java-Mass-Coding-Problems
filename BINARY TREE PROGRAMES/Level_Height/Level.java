package Level_Height;

public class Level {
    public static void main(String args[])
    {
        System.out.println("HELLO PRAJEESH...");

        SubLevel BinaryTrees = new SubLevel(30);

        BinaryTrees.InsertTreeNodes(500);
        BinaryTrees.InsertTreeNodes(300);
        BinaryTrees.InsertTreeNodes(20);
        BinaryTrees.InsertTreeNodes(1000);
        BinaryTrees.InsertTreeNodes(2003);
        BinaryTrees.InsertTreeNodes(2009);
        BinaryTrees.InsertTreeNodes(1975);
        BinaryTrees.InsertTreeNodes(1980);

        SubLevel.PostOrder(BinaryTrees.Root);
        System.out.println(" ");
        SubLevel.InOrder(BinaryTrees.Root);
        System.out.println(" ");
        SubLevel.PostOrder(BinaryTrees.Root);
        System.out.println(" ");

        if (BinaryTrees.Search(BinaryTrees.Root,500) == null)
        {
            System.out.println("Your Data is Not Found...");
        }else {
            System.out.println("Your Data is Found...");
        }

        BinaryTrees.HeightOfBinaryTree(BinaryTrees.Root);
        System.out.println(" ");

        SubLevel.InOrder(BinaryTrees.Root);
        System.out.println(" ");
    }
}
