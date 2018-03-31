package bishi;

import java.util.Scanner;

public class P84 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	int []nums=new int[n+1];
        	for(int i=1;i<=n;i++){
        		nums[i]=sc.nextInt();
        	}
        	int k=sc.nextInt();
        	int res=0;
        	int s=0;
        	int []dp=new int[n+1];
        	int cur=Integer.MIN_VALUE;
        	for(int i=1;i<=n;i++){
        		dp[i]=Math.max(nums[i]+cur,dp[i-1]);
        		if(i>=k){
        			cur=Math.max(cur,dp[i-k]-nums[i]);
        		}else{
        			cur=Math.max(cur, -nums[i]);
        		}
        		res=Math.max(res,dp[i]);
        	}
        }
	}

}
