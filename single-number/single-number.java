class Solution {
    public int singleNumber(int[] nums) {
  
         Set<Integer> mySet = new HashSet<>();
        
        for (int num : nums) {
            if (mySet.contains(num)) {
                mySet.remove(num);
            } else {
                mySet.add(num);
            }
        }
        return mySet.iterator().next();

        
    }
}