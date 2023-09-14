class Solution {
    public int[] plusOne(int[] digits) {
          // desc loop on digits array to check latest element on array

        // 123 => 124
        // 9 => 10
        // 99 => 100
        // 199 => 200
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                //if array element less than 9 just increment it by one
                digits[i]++;
                //return array after increment digit
                return digits;
            }
            // if array element == 9 just make it = 0 and declaration a new array with length = digits.length+1 ; 99 => 00 and add 1 in at the first =>100
            digits[i]=0;
        }
        int[]arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}