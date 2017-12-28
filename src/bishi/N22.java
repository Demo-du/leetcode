package bishi;

import java.util.Scanner;

public class N22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int []num=new int[4];
        for(int i=0;i<4;i++){
        	num[i]=sc.nextInt();
        }
        solve(num);
	}
    public static void solve(int num[]){
    	int A,B,C;
    	A=(num[0]+num[2])/2;
    	B=num[2]-A;
    	C=(num[3]-num[1])/2;
    	System.out.println(A+" "+B+" "+C);
    }
}
