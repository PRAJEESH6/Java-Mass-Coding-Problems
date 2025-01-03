package House_Robber_2;

public class Robber {
    public static void main(String args[])
    {
        System.out.println("Welcome Prajeesh...");

        int[] nums = {60,34,20,1,500};

        HouseCircle(nums);
    }

    public static int HouseCircle(int[] nums)
    {
        if (nums.length < 2)
        {
            return nums[0];
        }

        int[] SkipFirst = new int[nums.length];
        int[] SkipLast = new int[nums.length];

        for (int i=0;i<nums.length;i++)
        {
            SkipLast[i] = nums[i];
            SkipFirst[i] = nums[i + 1];
        }

        int First = RobMethod(SkipFirst);
        int Last = RobMethod(SkipLast);

        return Math.max(First,Last);
    }

    public static int RobMethod(int[] nums)
    {
        if (nums.length < 2)
        {
            return nums[0];
        }

        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],nums[2]);

        for (int i = 2;i<nums.length;i++)
        {
            dp[i] = Math.max(dp[i-2] + nums[i] , nums[i-1]);
        }

        return dp[nums.length-1];
    }
}
