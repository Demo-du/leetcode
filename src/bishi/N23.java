package bishi;

import java.util.Scanner;

public class N23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        solve(sc.nextInt());
	}
    public static void solve(int n){
    	int len=n/6;
    	int ans=Integer.MAX_VALUE;
    	for(int i=0;i<=len;i++){
    		for(int j=0;j<=len;j++){
    			if(i*6+j*8==n){
    				ans=Math.min(ans, i+j);
    			}
    		}
    	}
    	System.out.println(ans);
    }
}
