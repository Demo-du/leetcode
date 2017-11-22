package leetcode;

public class N21 {

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
		n1.next=n3;
		n2.next=n4;
		n3.next=n5;
		N21 n21=new N21();
		System.out.println(n21.mergeTwoLists(n1, n2).next.next.val);
	}
	public ListNode mergeTwoLists(ListNode l1,ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		int index1=0;
		int index2=0;
		ListNode p1=l1;
		ListNode p2=l2;
		ListNode p4=new ListNode(0);
		ListNode p3=p4;
		while(p1!=null&&p2!=null){
			if(p1.val>p2.val){
				p3.next=p2;
				p3=p3.next;
				p2=p2.next;
			}else{
				//System.out.println("一"+p1.val+" "+p2.val+" "+p3.val);
				p3.next=p1;
				p3=p3.next;
				p1=p1.next;
			//	System.out.println("2"+p1.val+" "+p2.val+" "+p3.val);
			}
		}
		if(p1==null){
			p3.next=p2;
		}else if(p2==null){
			p3.next=p1;
		}
		return p4.next;
	}

}
