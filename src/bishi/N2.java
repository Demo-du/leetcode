package bishi;

import java.util.HashSet;
import java.util.Scanner;

public class N2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(true){
        	HashSet<Integer> set=new HashSet<Integer>();
        	int num1=sc.nextInt();
        	int num2 =sc.nextInt();
        	for(int i=0;i<num1;i++){
        		set.add(sc.nextInt());
        	}
        	for(int i=0;i<num2;i++){
        		set.add(sc.nextInt());
        	}
        	for(int a:set){
        		System.out.print(a+" ");
        	}
        }
	}

}
