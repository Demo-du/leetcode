package bishi;

import java.util.Scanner;

public class P57 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
        	nums[i]=sc.nextInt();
        }
        int[]dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
        	if(dp[i-1]<0){
        		dp[i]=nums[i];
        	}else{
        		dp[i]=nums[i]+dp[i-1];
        	}
        }
        System.out.println(dp[n-1]);
	}

}
