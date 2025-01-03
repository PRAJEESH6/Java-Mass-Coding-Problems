
public class SubClass {
    public static void main(String[] args) {

        int[] MainArray = {1,2,2,3};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target1 = 2;

        System.out.println("This is Upper Bound Result....");
        UpperBound(MainArray,start,end,target1);
    }

    static void UpperBound(int[] MainArray,int start,int end,int target1)
    {
        while (start <= end)
        {
            int Umiddle = (start + end)/2;

            if(MainArray[Umiddle] > target1)
            {
                System.out.println(Umiddle);
                System.exit(1);
            }else {
                System.out.println(end);
                System.exit(1);
            }
        }
    }
}