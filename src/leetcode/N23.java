package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class N23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode mergeKLists(ListNode[] lists) {
    	PriorityQueue<ListNode> heap=new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){
    		 @Override  
             public int compare(ListNode n1, ListNode n2)  
             {  
                 return n1.val-n2.val;  
             }  
    	});
    	for(int i=0;i<lists.length;i++){
    		ListNode node=lists[i];
    		if(node!=null){
    			heap.add(node);
    		}
    	}
    	ListNode head=new ListNode(0);
    	ListNode n1=head;
    	//head.next=n1;
    	while(!heap.isEmpty()){
    		n1.next=heap.poll();
    		n1=n1.next;
    		if(n1.next!=null){
    			heap.add(n1.next);
    		}
    	}
    	return head.next;
    }
}
