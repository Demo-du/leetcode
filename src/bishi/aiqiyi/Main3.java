package aiqiyi;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();
        	//int []num=new int[26];
        	/*for(int i=0;i<s.length();i++) {
        		num[s.charAt(i)]++;
        	}*/
        	String res="";
        	char tmp=s.charAt(0);
        	res+=tmp;
        	for(int i=1;i<s.length();i++) {
        		if(s.charAt(i)>=tmp) {
        			tmp=s.charAt(i);
        			res+=tmp;
        		}else {
        			
        		}
        	}
        	System.out.println(res);
        }
	}
   
}
