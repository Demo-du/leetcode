package bishi;

import java.util.Scanner;

public class P40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int mlen=-1;
        int [][]dp=new int[a.length()+1][b.length()+1];
        for(int i=0;i<a.length();i++){
        	for(int j=0;j<b.length();j++){
        		if(a.charAt(i)==b.charAt(j)){
        			dp[i+1][j+1]=dp[i][j]+1;
        		}
        		if(dp[i+1][j+1]>mlen){
        			mlen=dp[i+1][j+1];
        		}
        	}
        }
        System.out.println(mlen);
	}
    
}
