package wangyi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int num=0;
        	//int index1=1;
        	//int index2=1;
        	/*while(index1<=n&&index2<=n) {
        		if(index1==index2) {
        			if(k==0) {
        				num++;
        			}
        			index2++;
        		}
        		if(index2)
        	}*/
        	for(int i=1;i<=n;i++) {
        		for(int j=1;j<=n;j++) {
        			if(i%j>=k) {
        				num++;
        			}
        		}
        	}
        	System.out.println(num);
        }
	}

}
