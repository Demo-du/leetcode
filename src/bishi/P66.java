package bishi;

import java.util.Scanner;

public class P66 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int x=sc.nextInt();
        	int tmp=x;
        	int cnt=0;
        	while(x!=0){
        		if((x&1)==1){
        			cnt++;
        			
        		}
        		x=x>>1;
        	}
        	System.out.println(cnt);
        }
	}

}
