public class FIrst_Last_Occurance {
    public static void main(String[] args)
    {
        System.out.println("WELCOME BINARY SEARCH WORLD PRAJEESH...");

        int[] MainArray = {1,3,13,13,13,20,50};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target = 13;
        int ans = -1;
        int ans1 = -1;

        FirstOccurance(MainArray,start,end,target,ans);
        LastOccurance(MainArray,start,end,target,ans1);
    }

    static void FirstOccurance(int[] MainArray,int start,int end,int target,int ans)
    {
        while (start <= end)
        {
            int middle = (start+end)/2;

            if (MainArray[middle] >= target)
            {
                ans = middle;
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        System.out.println("First Accurence is : " + ans);
    }

    static void LastOccurance(int[] MainArray,int start,int end,int ans1,int target)
    {
      while (start <= end)
      {
          int middle = (start+end)/2;

          if(MainArray[middle] >= target)
          {
             ans1 = middle;
             start = middle + 1;
          }else {
             end = middle - 1;
          }
      }
      System.out.println("Last Accurence IS : " + ans1);
    }
}
