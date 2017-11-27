package leetcode;

public class N25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(head == null || k == 1){
    		return head;
    	}
    	ListNode help = new ListNode(0);
    	help.next = head;
    	int count = 0;
    	ListNode pre = help;
    	ListNode cur = head;
    	while(cur!=null){
    		count++;
    		ListNode next = cur.next;
    		if(count==k){
    			pre=reverse(pre,next);
    			count=0;
    		}
    		cur=next;
    	}
        return help.next; 
    }
    /*
     * 反转链表，第一个指向最后一个
     */
    /*public  ListNode reverse(ListNode pre, ListNode next){
    	ListNode last=pre.next;
    	ListNode cur=last.next;
    	while(cur!=next){
    		last.next=cur.next;
    		cur.next=pre.next;
    		pre.next=cur;
    		cur=last.next;
    	}
    	return last;
    }*/
    public  ListNode reverse(ListNode pre, ListNode next){
    	ListNode last=pre.next;
    	ListNode cur=last.next;
    	while(cur!=next){
    		last.next=next;
    		ListNode tmp=cur.next;
    		cur.next=pre.next;
    		pre.next=cur;
    		cur=tmp;
    	}
    	return last;
    }
}
