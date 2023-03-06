using System;
namespace  Application
{
    public class main{
        static void Main(string[]app){

// Example 1:

// Input: arr = [2,3,4,7,11], k = 5
// Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
// Example 2:

// Input: arr = [1,2,3,4], k = 2
// Output: 6
// Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

        int []arr={2,3,4,7,11};
        Console.Write(FindKthPositive(arr,5));

        }



          public static int FindKthPositive(int[] arr, int k) {
                int[]newarr=new int[arr.Length+k];
                for(int i=1,j=0; j<newarr.Length;i++){
                    
                    if(arr.Contains(i)){
                        continue;
                    }
                    newarr[j]=i;
                    j++;
                }
                return newarr[k-1];
            }
    }
    
}