package wangyi;

import java.util.Scanner;

public class Main2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int num=0;
        	
        	for(int i=k;i<=n;i++) {
        		int tmp=n-i;
        		num+=tmp;
        	}
        	
        	for(int i=k;i<=n;i++) {
        		for(int j=2;j<=i;j++) {
        			
        			if(i%j>=k) {
        				//System.out.println("x,y"+i+" "+j);
        				num++;
        			}
        		}
        	}
        	System.out.println(num);
        }
	}

}
