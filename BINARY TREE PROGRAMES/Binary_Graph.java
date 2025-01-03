public class Binary_Graph {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");

        Sub tree = new Sub();
        tree.BinaryRoot(10);

        tree.InsertLeft(tree.Root,5 );
        tree.InsertRight(tree.Root,15);
        tree.InsertLeft(tree.Root.left,8);
        tree.InsertLeft(tree.Root.right,9);
        tree.InsertRight(tree.Root.left,30);

        Sub.PreOrder(tree.Root);
        System.out.println(" ");
        Sub.InOrder(tree.Root);
        System.out.println(" ");
        Sub.PostOrder(tree.Root);
    }
}
