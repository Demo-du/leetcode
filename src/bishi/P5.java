package bishi;

import java.util.Scanner;

public class P5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        String a=sc.nextLine();
        String b=sc.nextLine();
        System.out.println(solve(n,a,b));
	}
    public static int solve(int n,String s1,String s2){
    	int res1=0;
    	int res2=0;
    	for(int i=0;i<n;i++){
    		res1=res1*2;
    		res2=res2*2;
    		//System.out.println(s1);
    		int tmp1=s1.charAt(i)-'0';
    		int tmp2=s2.charAt(i)-'0';
    		res1+=tmp1;
    		res2+=tmp2;
    	}
    	return res1^res2;
    }
}
