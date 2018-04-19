package aiqiyi;

import java.util.Scanner;

public class Main {

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
        	int []k=new int[1];
        	digui(limit,0,zhong,num,0,k);
        	System.out.println(k[0]);
        }
	}
	public static void digui(int [][]limit,int j,int zhong,int target,int sum,int []k) {
		//System.out.println(sum);	
		if(sum==target&&j==zhong) {
			//System.out.println(j);
			k[0]++;
			return;
		}
		if(sum>target||j>zhong-1) {
			return;
		}
		for(int i=limit[j][0];i<=limit[j][1];i++) {
			sum+=i;
			digui(limit,j+1,zhong,target,sum,k);
			sum=sum-i;
		}
	}

}
