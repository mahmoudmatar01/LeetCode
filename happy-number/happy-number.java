class Solution {
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSum(n);
        }

        return n == 1;
    }

    private static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            //to get the last digit
            int digit = n % 10;
            sum += digit * digit;
            //removes the last digit 
            n /= 10;
        }
        return sum;
    }

}