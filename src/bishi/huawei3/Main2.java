package huawei3;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int []nums=new int[n];
        	int []dp=new int[n];
        	for(int i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        	}
        	dp[0]=0;
        	for(int i=1;i<n;i++) {
        		int min=Integer.MAX_VALUE;
        		for(int j=i-1;j>=0;j--) {
        			
        			if(nums[j]+j>=i) {
        				if(dp[j]+1<min) {
        					min=dp[j]+1;
        				}
        			}
        			
        		}
        		dp[i]=min;
        	}
        	System.out.println(dp[n-1]);
        }
	}

}
