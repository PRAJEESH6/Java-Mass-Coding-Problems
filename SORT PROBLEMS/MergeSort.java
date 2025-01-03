import java.util.Arrays;

public class MergeSort {

    public static void main(String args[])
    {
        System.out.println("WELCOME MERGE SORT WORLD PRAJEESH..");

        int[] array = {9,4,7,1,6,2,8,4};
        mergeSort(array);

    }

    public static int[] mergeSort(int[] array)
    {
        if(array.length == 1)
        {
            return array;
        }

        int middle = array.length/2;

        int[] left  = mergeSort(Arrays.copyOfRange(array,0,middle));
        int[] right = mergeSort(Arrays.copyOfRange(array,middle,array.length));

        return mergeArrays(left,right);
    }

    public static int[] mergeArrays(int[] first,int[] second)
    {
        int[] joined = new int[first.length+second.length];
        int i=0,j=0,k=0;

        while (i<first.length && j<second.length)
        {
            if (first[i] < second[j])
            {
                joined[k++] = first[i++];

            }else{

                joined[k++] = second[j++];
            }
        }

        while (i<first.length)
        {
            joined[k++] = first[i++];
        }

        while (j<second.length)
        {
            joined[k++] = second[j++];
        }

        System.out.println(Arrays.toString(joined));
        return joined;
    }
}
