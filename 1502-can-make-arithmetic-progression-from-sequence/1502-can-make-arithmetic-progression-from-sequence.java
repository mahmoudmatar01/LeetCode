class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        if(arr.length < 2){
            return false;
        }
        
        Arrays.sort(arr);
        int firstTwoNumbersDiff= arr[1]-arr[0];
        
        for (int i=2; i<arr.length; i++){
            if(arr[i]-arr[i-1] != firstTwoNumbersDiff )
                return false;
        }
        return true;
    }
}