public class Insertion {
    public static void main(String[] args)
    {
        int[] MainArray = {1,2,4,7};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target = 2;
        int ans = end;

        Position(MainArray,start,end,target,ans);
    }

    static void Position(int[] MainArray,int start,int end,int target,int ans)
    {
        while (start <= end)
        {
            int middle = (start + end)/2;

            if(MainArray[middle] >= target)
            {
                ans = middle;
                end = middle - 1;
            }else {
                start = middle + 1;
            }
        }

        System.out.println(ans);
        System.exit(1);
    }
}
