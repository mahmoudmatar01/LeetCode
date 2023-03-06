using System;
using System.Text;

namespace Application
{
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.




    public class amin{
        static void Main(string[]args){
            Console.Write(LengthOfLongestSubstring("pwwkew"));
         
            
        }


        public static int LengthOfLongestSubstring(string s) {
        
            int Maxlength=0;
            HashSet<char> newtxt=new HashSet<char>();

//          check if String is Vaild
            if(s.Length==1){
                return 1;
            }
            if(s.Length==0 || s==null){
                return 0;
            }

            for(int i=0,k=0;i<s.Length;i++){
              
              while(newtxt.Contains(s.ElementAt(i))){

                    newtxt.Remove(s.ElementAt(k));
                    k++;
              }
              newtxt.Add(s.ElementAt(i));
              Maxlength=Math.Max(i-k+1,Maxlength);
            }


            return Maxlength;

            }



            // Anthor Solution
  public static int LengthOfLongestSubstring2(string s) {
        
            int Maxlength=0 ,i=0,k=0;
            HashSet<char> newtxt=new HashSet<char>();

//          check if String is Vaild
            if(s.Length==1){
                return 1;
            }
            if(s.Length==0 || s==null){
                return 0;
            }

            while(i<s.Length){
              while(newtxt.Contains(s.ElementAt(i))){
                    newtxt.Remove(s.ElementAt(k));
                    ++k;
              }
              newtxt.Add(s.ElementAt(i));
              Maxlength=Math.Max(i-k+1,Maxlength);
              ++i;
            }


            return Maxlength;

            }



    }

}