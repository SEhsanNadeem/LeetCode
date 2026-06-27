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
// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         ListNode temp = head;
//         ListNode previous= null;

//         while(temp != null)
//         {
//             temp = temp.next;
//             previous= temp ;
            
//         }

//         return temp;

//     }


    class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next; // original next save karo

            curr.next = prev;          // current ka link reverse karo

            prev = curr;               // prev ko aage move karo
            curr = next;               // curr ko aage move karo
        }

        return prev;
    }
}

//     public static ListNode ReverseList(ListNode head) {
//         ListNode current = head;
// ListNode previous = null;
// while(current != null){
// ListNode temp = current.next;
// current.next = previous;
// previous = current;
// current = temp;
// }
//         head = previous;
// return head;
//     }
// }