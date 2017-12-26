package bishi;

import java.util.Scanner;

public class N14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        solve(n,k);
	}
    public static void solve(int n,int k){
    	int [][]dp=new int[n+1][k+1];
    	for(int i=0;i<=n;i++){
    		dp[i][0]=1;
    	}
    	for(int i=2;i<=n;i++){
    		for(int j=1;j<=k;j++){
    			dp[i][j]=dp[i-1][j-1]/*插入在结尾，增加一个<*/+dp[i-1][j-1]*(i-j-1)/*插入在>处，增加一个<*/
    					+dp[i-1][j]/*插入在开头，增加一个>*/+dp[i-1][j]*j/*插入在<处，增加一个>*/;
    		}
    	}
    	System.out.println(dp[n][k]);  
    }
}
