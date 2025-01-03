public class Floor_Ciel {
    public static void main(String[] args)
    {
        int[] MainArray = {3, 4, 4, 7, 8, 10};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target = 5;
        int ans = -1;
        int ans1 = -1;

        Prajeesh(MainArray,start,end,target,ans);
    }

    static void Prajeesh(int[] MainArray,int start,int end,int target,int ans)
    {
        while (start <= end)
        {
            int middle = (start+end)/2;

          if(MainArray[middle] <= target)
          {
              ans = MainArray[middle];
              start = middle + 1;
          }else {
              end = middle -1;
          }
        }
        System.out.println(ans);
        System.exit(1);

    }
}
