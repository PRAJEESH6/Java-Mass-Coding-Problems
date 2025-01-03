package House_Robber_3;

public class Sub_Rob {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh");

        Rob binary = new Rob();

        binary.BinaryRobbery(30);
        binary.InsertNode(50);
        binary.InsertNode(40);
        binary.InsertNode(60);
        binary.InsertNode(49);

       Rob.PreOrder(binary.Root);

       binary.roob(binary.Root);
    }
}
