import java.util.Arrays;

public class Main {

    final static int Array_Size = 10;
    final static int Num_Threads = 4;

    public static void main(String[] args)
    {
        System.out.println("Hello Welcome Multhithrad world Prajeesh...!");

        int[] array = {10,3,2,1,3,6};
        int[] array2 = {2,5,4,90,100};
        int[] array3;
        int i = 0;
        int j = 0;
        int k = 0;

       while (array != null && array2 != null)
       {
           if(array[i] < array2[j])
           {
               array3 = array[i++];
           }else{

               if(array[i] > array2[j])
               {
                   array3 = array2[j++];
               }
           }
       }
       System.out.println(array3);

        System.out.println("ToString : " + Arrays.toString(array));
        System.out.println("ToString : " + Arrays.toString(array2));


    }
}