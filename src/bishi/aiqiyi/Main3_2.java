package aiqiyi;

import java.util.Scanner;

public class Main3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int zhong=sc.nextInt();
        	int num=sc.nextInt();
        	int [][]limit=new int[zhong][2];
        	for(int i=0;i<zhong;i++) {
        		limit[i][0]=sc.nextInt();
        		limit[i][1]=sc.nextInt();
        	}
        	int [][]dp=new int[zhong][num+1];
        	dp[0][0]=1;
        	for(int i=0;i<num+1;i++) {
        		dp[0][i]=1;
        	}
        	for(int i=0;i<zhong;i++) {
        		dp[i][0]=1;
        	}
        	for(int i=1;i<zhong;i++) {
        		for(int j=1;j<num+1;j++) {
        			//if(dp[i-1])
        			for(int z=limit[i][0];z<=limit[i][1];z++) {
        				if(j>=z) {
        					dp[i][j]+=dp[i-1][j-z];
        				}
        			}
        		}
        	}
        	System.out.println(dp[zhong-1][num-1]-1);
        }
	}

}
