package leetcode;

public class N24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public ListNode swapPairs(ListNode head) {
	    	if(head==null){
	    		return null;
	    	}
	    	if(head.next==null){
	    		return head;
	    	}
	        ListNode help=new ListNode(0);
	        help.next=head;
	    	ListNode pre=help;
	    	ListNode node=head;
	    	while(node!=null&&node.next!=null){
	    		ListNode temp=node.next.next;
	    		pre.next=node.next;
	    		node.next.next=node;
	    		if(temp!=null&&temp.next!=null){
	    			node.next=temp.next;
	    		}else{
	    			node.next=temp;
	    		}
	    		pre=node;
	    		node=temp;
	    	}
	        return help.next;
	    }
}
