/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
       //  List<ListNode> middleArray=new ArrayList<ListNode>();
       // int lenght=0;
       // while (head!=null){
       //     middleArray.add(head);
       //     head=head.next;
       //     lenght++;
       // }
       // return middleArray.get(lenght/2);
         // time complexity => o(N)
        // space complexity =>o(n)
        
         if(head==null){
            return null;
        }
        
        ListNode middle=head;
        ListNode end=head;
        
        while (end!=null&&end.next!=null){
            middle=middle.next;
            end=end.next.next;
        }
        return middle;
        //  time complexity => o(N)
        // space complexity=>o(1)
    }
}