class Solution {
public:
    int countOdds(int low, int high) {
        if (low == high) {
            return (low % 2 != 0) ? 1 : 0;
        }
        
        if (low % 2 == 0) {
            low++;
        }
        if (high % 2 == 0) {
            high--;
        }
        
        // Calculate the number of odd numbers using count=( ( end − start) / 2 )+1
        return ((high - low) / 2) + 1;
    }
};