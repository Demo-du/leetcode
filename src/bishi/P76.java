package bishi;

import java.util.Scanner;

public class P76 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s1=sc.nextLine();
        	String s2=sc.nextLine();
        	int []nums=new int[300];
        	for(int i=0;i<s2.length();i++){
        		nums[s2.charAt(i)]++;
        	}
        	String res="";
        	for(int i=0;i<s1.length();i++){
        		if(nums[s1.charAt(i)]==0){
        			res+=s1.charAt(i);
        		}
        	}
        	System.out.println(res);
        }
	}

}
