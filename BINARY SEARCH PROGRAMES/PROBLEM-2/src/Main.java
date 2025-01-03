import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world! Prajeesh...");

        int[] mainArray = {1,5,6,7,8,9,10,10,60};
        int start = mainArray[0];
        int target = 10;
        int end = mainArray.length - 1;
        int middle = (start + end)/2;
        int[] answerArray = new int[2];
        answerArray[0] = -1;
        answerArray[1] = -1;

        Search(mainArray,target,start,end,middle,answerArray);

    }

    static void Search(int[] array,int target,int start,int end,int middle,int[] answerArray)
    {
//         while (end != 0)
//         {
//             if (target > array[middle])
//             {
//                 start = middle + 1;
//                 for(int i=0;start<=array.length;i++)
//                 {
//                     System.out.println(i);
//                 }
//
//             } else if (target < array[middle]) {
//                 end = middle -1;
//             }else {
//                 System.out.println(answerArray[0]);
//                 System.exit(1);
//             }
//         }
//        System.out.println(answerArray);
//        System.exit(1);

        for (int i=0;i<array.length;i++)
        {
            if(target == array[i])
            {
                answerArray[0] = i;
                int d = array[i++];
                if (target == d)
                {
                    answerArray[1] = i;
                }
                System.out.println(Arrays.toString(answerArray));
                System.exit(1);
            }

        }
        System.out.println(Arrays.toString(answerArray));
        System.exit(1);
    }
}