/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 // store the set A in hashset and compare it with the set B
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        
    HashSet<ListNode> inter= new HashSet<>();
        
         while(headA!= null)
         {
         inter.add(headA);
         headA = headA.next;
         }
        
        while(headB!= null)
        {
            if(inter.contains(headB)){
                return headB;
            }
        
        headB = headB.next;
    }
         return headB;
        }
    }
