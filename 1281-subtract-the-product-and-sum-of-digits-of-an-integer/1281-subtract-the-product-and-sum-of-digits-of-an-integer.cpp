class Solution {
public:
    int subtractProductAndSum(int n) {
        int digitsSum=0;
        int digitsProduct=1;

        while(n>0){
            int digit=n%10;
            digitsSum+=digit;
            digitsProduct*=digit;

            n/=10;
        }
        return digitsProduct-digitsSum;
    }
};