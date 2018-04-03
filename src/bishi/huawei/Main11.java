package huawei;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();
        	System.out.println(longest(s).length());
        }
	}
   public static String getpl(String s,int l,int r) {
	   int n=s.length();
	   while(l>=0&&r<=n-1&&s.charAt(l)==s.charAt(r)) {
		   l--;
		   r++;
	   }
	   return s.substring(l+1, r);
   }
   public static String longest(String s) {
	   int n=s.length();
	   if(n==0) {
		   return  "";
	   }
	   String longest=s.substring(0, 1);
	   for(int i=0;i<n-1;i++) {
		   String p1=getpl(s,i,i);
		   if(p1.length()>longest.length()) {
			   longest=p1;
		   }
		   String p2=getpl(s,i,i+1);
		   if(p2.length()>longest.length()) {
			   longest=p2;
		   }
	   }
	   return longest;
   }
}
