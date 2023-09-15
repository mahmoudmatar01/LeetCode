class Solution {
    public void moveZeroes(int[] nums) {
       int nonZeroElementIndex = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroElementIndex];
                nums[nonZeroElementIndex] = temp;
                nonZeroElementIndex++;
            }
        }
        
    }
}