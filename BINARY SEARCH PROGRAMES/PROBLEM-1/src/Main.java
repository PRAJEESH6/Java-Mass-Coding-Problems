public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world! Prajeesh...");

        int[] array = {1, 5, 6, 7, 11, 13, 67};

        int start = array[0];
        int end = array.length - 1;
        int target = 13;

        Research(array,start,end,target);

    }

    static void Research(int[] array,int start,int end,int target)
    {

        while (start < end)
        {
            int mid = (start + end) / 2;
            if(target == array[mid])
            {
               System.out.println(mid);
               System.exit(1);
            }

            if (target > array[mid]) {
                start = mid +1;
            } else if (target < array[mid]) {
                end = mid - 1;
            }else {
                System.out.println(mid);
                System.exit(1);
            }
        }
        System.out.println("-1");
        System.exit(1);
    }
}