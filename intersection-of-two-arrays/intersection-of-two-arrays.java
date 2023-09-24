class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer>mySet=new HashSet();
        for (int num : nums1) {
            mySet.add(num);
        }
        mySet.stream().forEach(System.out::println);
        //to avoid duplicated data
        Set<Integer>intersectionSet=new HashSet<>();

        for (int num : nums2) {
            if (mySet.contains(num)) {
                intersectionSet.add(num);
            }
        }
        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];

        int i = 0;
        for (int num : intersectionSet) {
            result[i] = num;
            i++;
        }

return result;
    }
}