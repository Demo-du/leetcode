package bishi;

import java.util.Scanner;

public class P85 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
        	int []num=new int[1000];
        	String []str=s.split(",");
        	for(int i=0;i<str.length;i++){
        		num[Integer.parseInt(str[i])]++;
        	}
        	for(int i=0;i<str.length;i++){
        		if(num[Integer.parseInt(str[i])]==1){
        			System.out.println(str[i]);
        			break;
        		}
        	}
        }
	}

}
