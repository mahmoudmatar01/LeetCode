package com.company;

public class Main {

    public static void main(String[] args) {


//        Input: piles = [3,6,7,11], h = 8
//        Output: 4
         int[]arr={3,6,7,11};
         System.out.print(minEatingSpeed(arr,8));

    }

    public static int minEatingSpeed(int[] piles, int h) {

        int right= max(piles);
        int left=0;
        while(left<right){
            int mid=(left+right)/2;
            int total_hour=0;
            for(int i=0;i<piles.length;i++){
                total_hour+=(Math.ceil((double)piles[i]/mid));
            }

            if(total_hour>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return right;

    }


    public static int max(int[]arr){
        int max=arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
