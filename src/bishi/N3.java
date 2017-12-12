package bishi;

import java.util.Scanner;

public class N3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(true){
        	int num=sc.nextInt();
        	double dp[][]=new double[num+1][num+1];
        	double []a=new double[num+1];
        	for(int i=1;i<=num;i++){
        		a[i]=sc.nextDouble();
        	}
        	dp[0][0]=1;
        	for(int i=1;i<=num;i++){
        		dp[i][0]=dp[i-1][0]*(100.0-a[i])/100.0;
        	}
        	for(int i=1;i<=num;i++){
        		for(int j=1;j<=num;j++){
        			dp[i][j]=dp[i-1][j]*(100.0-a[i])/100.0+dp[i-1][j-1]*(a[i])/100.0;
        		}
        	}
        	int start=(int) Math.ceil((3*num)/5.0);
        	double res=0;
        	for(int i=start;i<=num;i++){
        		res+=dp[num][i];
        	}
        	String s=String.format("%.5f",res);
        	System.out.print(s);
        }
        
	}
}
