package HOUSE_ROBBER;

import java.util.Arrays;

public class House_Rob {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh Welome...");

        int[] nums = {5,90,30,23,100,100,300,50,600};

        Robing_Money(nums);
    }

    public static int Robing_Money(int[] nums)
    {
        if (nums.length < 2)
        {
            return nums[0];
        }

        int[] DP = new int[nums.length];

        DP[0] = nums[0];
        DP[1] = Math.max(nums[1],nums[2]);

        for (int i = 2;i<nums.length;i++)
        {
            DP[i] = Math.max(DP[i-2] + nums[i],DP[i-1]);
        }

        System.out.println(DP[nums.length - 1]);
        return DP[nums.length - 1];
    }
}
