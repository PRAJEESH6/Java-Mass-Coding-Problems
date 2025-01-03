import java.util.Arrays;

public class PROBLEM {
    public static void main(String args[])
    {
        System.out.println("WELCOME SORTING WORLD PRAJEESH...");

        int[] MainArray = {5,6,10,40,55,70,3,2,0};
        System.out.println("BEFORE THE ARRAY :=>  " + Arrays.toString(MainArray));

         Sorting(MainArray);
         Desending(MainArray);
    }

    static void Sorting(int[] MainArray)
    {
       for (int i=0;i<MainArray.length;i++)
       {
           int min_value = MainArray[i];
           int min_index = i;

           for (int p=i;p<MainArray.length;p++)
           {
               if (MainArray[p] < min_value)
               {
                   min_value = MainArray[p];
                   min_index = p;
               }
           }

           int temp = MainArray[i];
           MainArray[i] = MainArray[min_index];
           MainArray[min_index] = temp;
       }

       System.out.println("AFTER THE ARRAY :=>  " + Arrays.toString(MainArray));
    }

    static void Desending(int[] MainArray)
    {
        for (int i=0;i<MainArray.length;i++)
        {
            int max_value = MainArray[i];
            int max_index = i;

            for(int s=i;s<MainArray.length;s++)
            {
                if (MainArray[s] > max_value)
                {
                    max_value = MainArray[s];
                    max_index = s;
                }
            }

            int temp = MainArray[i];
            MainArray[i] = MainArray[max_index];
            MainArray[max_index] = temp;
        }

        System.out.println("DESENDING ARRAY : => " + Arrays.toString(MainArray));
    }
}
