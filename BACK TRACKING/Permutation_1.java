import java.util.ArrayList;
import java.util.List;

public class Permutation_1 {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");
        int[] nums={1,2,3};
        Permethod(nums);
    }

    public static void Permethod(int[] nums)
    {
        List<List<Integer>> resultList = new ArrayList<>();

        BackTracking(resultList,new ArrayList(),nums);
    }

    public static void BackTracking(List<List<Integer>> resultList,ArrayList<Integer> tempList, int[] nums)
    {


        if (tempList.size() == nums.length)
        {
            resultList.add(new ArrayList<>(tempList));
           // System.out.println(resultList);
            return;
        }

        for (int numbers : nums)
        {
            if (tempList.contains(nums))
            {
                continue;
            }

            tempList.add(numbers);
            BackTracking(resultList,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
}
