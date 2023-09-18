class Solution {
    public int[] runningSum(int[] nums) {
          int[]result=new int[nums.length];
        int sum=nums[0];
        result[0]=nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum+=nums[i];
            result[i]=sum;
        }

        return result;
    }
}