public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        int[] MainArray = {3,5,8,15,19};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target = 9;


        System.out.println("Binary Search Programme....");
        System.out.println("This is Lower Bound Result....");
        Rotation(MainArray,start,end,target);


    }

    static void Rotation(int[] MainArray,int start,int end,int target)
    {
        while (start <= end)
        {
            int middle = (start + end)/2;

            if(MainArray[middle] >= target)
            {
                System.out.println(middle);
                System.exit(1);
            }else {
                System.out.println(end);
                System.exit(1);
            }
        }
    }


}