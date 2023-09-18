class Solution {
    public int numberOfSteps(int num) {

        int count=0;

        while (num>0){
            if(num%2==0){
                num=num/2; //7 //3 //1
            }
            else {
                num=num-1; //6 //2  /0
            }
            count++;//2 //3 // 4 //5 //6
        }

        return count;
    }
}