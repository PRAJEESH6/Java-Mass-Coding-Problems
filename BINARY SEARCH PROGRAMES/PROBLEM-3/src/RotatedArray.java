public class RotatedArray {
    public static void main(String args[])
    {
        int[] MainArray = {4,5,6,7,0,1,2,3};
        int start = MainArray[0];
        int end = MainArray.length - 1;
        int target = 0;

        SearchPower(MainArray,start,end,target);
    }

    static int SearchPower(int[] MainArray,int start,int end,int target)
    {
        while (start <= end)
        {
            int middle = (start+end)/2;

            if(MainArray[middle] == target)
            {
                return middle;
            }

            if(MainArray[start] <= MainArray[middle]) {
                //LEFT SEARCH
                if (MainArray[start] <= target && target <= MainArray[middle]) {
                    end = middle - 1;
                } else {
                    start = start + 1;
                }

                //Right Search
                if (MainArray[middle] <= target && target <= MainArray[end]) {
                    start = middle + 1;
                } else {
                    end = end - 1;
                }

            }
        }
        return -1;
    }
}
