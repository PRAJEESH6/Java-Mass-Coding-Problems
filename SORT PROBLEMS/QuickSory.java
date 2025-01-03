import java.util.Arrays;

public class QuickSory {
    public static void main(String[] args)
    {
        System.out.println("WELCOME PRAJEESH..");

        int[] array = {10,3,5,1,0,20,5,4,90};

        Quick(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static int[] Quick(int[] array,int start,int end)
    {

        if(start >= end)
        {
            return array;
        }

        int s = start;
        int e = end;
        int m = (start+end)/2;
        int pivot = array[m];

       // while (start <= end) {

            while (array[s] < pivot) {
                s++;
            }

            while (array[e] > pivot) {
                e--;
            }

            if (start <= end) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;
            }

      //  }

            Quick(array,start,e);
            Quick(array,s,end);
           return array;
    }
}
