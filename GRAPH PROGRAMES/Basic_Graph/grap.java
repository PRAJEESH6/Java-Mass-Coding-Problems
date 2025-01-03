package Basic_Graph;

public class grap {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh");

        int[][] graph =
                {
                        {0,1,0,0,1},
                        {1,0,1,0,1},
                        {0,1,0,1,0},
                        {1,1,0,1,0}
                };

        Method method = new Method(5);

        method.ConnectEdge(0,1);
        method.ConnectEdge(1,0);
        method.ConnectEdge(2,3);
        method.ConnectEdge(1,2);
        method.ConnectEdge(3,4);
        method.ConnectEdge(0,4);
        method.ConnectEdge(1,4);

        method.Display();

        System.out.println("BFS SEARCH");
        method.BreatFirstSearch(0);
        System.out.println(" ");

        System.out.println("DFS SEARCH");
        method.DepthFirstSearch(0);
        System.out.println(" ");
    }
}
