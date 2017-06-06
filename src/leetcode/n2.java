package leetcode;
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Subscribe to see which companies asked this question.

 */
/*
 * 
 */
public class n2 {
    public static void mian(String []args){
    	
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1==null) return l2;
        if(l2==null) return l1;
    	ListNode head= new ListNode(0);
    	ListNode tmp=head;
    	int va=0;
    	
    	while(l1!=null||l2!=null||va!=0){
    		if(l1!=null) {
                va += l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                va += l2.val;
                l2 = l2.next;
            }
        
    		tmp.next=new ListNode(va%10);
    		tmp=tmp.next;
    		va=va/10;
    	}
       return head.next;
    }
}
class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	  }

