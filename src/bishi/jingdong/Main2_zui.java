package jingdong;

import java.util.Scanner;

public class Main2_zui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	for(int i=0;i<n;i++) {
        		long djj;
        		long kk=1;
        		djj=sc.nextLong();
        		if(!pd(djj)) {
        			System.out.println("No");
        		}else {
        			while(pd(djj)) {
        				djj=djj/2;
        				kk=kk*2;
        			}
        			System.out.println(djj+" "+kk);
        		}
        	}
        }
	}
	public static boolean pd(long n) {
		return (n&1)==0;
	}
}
