
using System;

    namespace  Application
    {

        public class Permutation {

            static void Main(String[]args){

                int []num={1,2,3,4};
              IList<IList<int>> res=permute(num);

              foreach (var i in res){
                
                Console.WriteLine(i);
                
              }
               


            }



            // permute method 
            public static IList<IList<int>> permute(int []num){
                
                var Res=new List<IList<int>>();
                // List<int>?pref=null;
                    PermuteRrc(new HashSet<int>(num),new List<int>(), Res!);


                return Res!;
            }


            // permutation Rec method
            public static void PermuteRrc(HashSet<int>num,List<int>prefix,IList<IList<int>>Result){

                //Base Case 
                if(num.Count==0){
                    Result.Add(new List<int>(prefix));
                    return;
                }


                // Take A copy from num
                HashSet<int>RemainingName=new HashSet<int>(num);


                foreach(var c in num){
                    RemainingName.Remove(c);
                    prefix.Add(c);
                    PermuteRrc(RemainingName,prefix,Result);
                    RemainingName.Add(c);
                    prefix.RemoveAt(prefix.Count-1);
                }

                

            } 

        }
        
    }


