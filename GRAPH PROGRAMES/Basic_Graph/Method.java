package Basic_Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Method {

    ArrayList<ArrayList<Integer>> AdjencencyList = new ArrayList();

    Method(int val)
    {
        for(int i=0;i<val;i++)
        {
           AdjencencyList.add(new ArrayList<Integer>());
        }
    }

    public void ConnectEdge(int a, int b)
    {
        AdjencencyList.get(a).add(b);
        AdjencencyList.get(b).add(a);
    }

    public void Display()
    {
        for (int p=0;p<AdjencencyList.size();p++)
        {
            System.out.println("Adjencency Vertax "  + p);

            for (int s=0;s<AdjencencyList.get(p).size();s++)
            {
                System.out.println(AdjencencyList.get(p).get(s) + " ");
            }
        }
    }

    public void BreatFirstSearch(int val)
    {
        int Size = AdjencencyList.size();
        boolean[] Visited = new boolean[Size];

        Visited[val] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(val);

        while (queue.size() != 0)
        {
            int vertex = queue.remove();
            System.out.print(vertex + " ");

            for (int i=0;i<AdjencencyList.get(vertex).size();i++)
            {
                int av = AdjencencyList.get(vertex).get(i);

                if (!Visited[av])
                {
                    queue.add(av);
                    Visited[av] = true;
                }
            }
        }
    }

    public void DepthFirstSearch(int val)
    {
        int A_size = AdjencencyList.size();
        boolean[] visited = new boolean[A_size];

        DFS(val,visited);
    }

    public void DFS(int val,boolean[] visited)
    {
        visited[val] = true;
        System.out.print(val +  " ");

        for (int i=0;i<AdjencencyList.get(val).size();i++)
        {
            int avs = AdjencencyList.get(val).get(i);

            if (!visited[avs])
            {
                DFS(avs,visited);
            }
        }
    }
}
