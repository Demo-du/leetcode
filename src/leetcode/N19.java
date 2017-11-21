package leetcode;

public class N19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		//n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		N19 n19=new N19();
		System.out.println(n19.removeNthFromEnd(n1, 1));
	}
     
     public ListNode removeNthFromEnd(ListNode head,int n){
    	 
    	
    	 ListNode first = new ListNode(0); 
    	 first.next=head;
    	 ListNode h1=first;
    	 ListNode h2=first;
    	// int index0=0;
    	// int index1=1;
    	 int index=0;
    	 while(index<n){
    		 if(h2.next==null){
    			 return head;
    		 }
    		 h2=h2.next;
    		 index++;
    	 }
    	 while(h2.next!=null){
    		h2=h2.next;
    		h1=h1.next; 
    	 }
    	 h1.next=h1.next.next;
    	// System.out.println(h1.val);
    	 return first.next;
     }
}
/*class ListNode{
	 int val;
	 ListNode next;
	 ListNode(int x){
		 val=x;
	 }
}*/