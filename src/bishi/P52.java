package bishi;

import java.util.Scanner;

public class P52 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n>0){
        	cnt+=n/5;
        	n=n/5;
        }
        System.out.println(cnt);
	}

}
