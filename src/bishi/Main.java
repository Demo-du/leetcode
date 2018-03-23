package bishi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String a=sc.next();
        	String b=sc.next();
        	int num=0;
        	char []L;
        	char[]S;
        	if(a.length()>b.length()) {
        		L=a.toCharArray();
        		S=b.toCharArray();
        	}else {
        		S=a.toCharArray();
        		L=b.toCharArray();
        	}
        	int index=0;
        	int index1=0;
        	int index2=0;
        	if(S.length==0||L.length==0) {
        		num=0;
        	}else while(index<L.length-S.length+1) {
        		while(index1<L.length&&index2<S.length) {
            		if(L[index1]!=S[index2]) {
            			//System.out.println(L[index1]);
            			num++;
            		}
            		index1++;
            		index2++;
            	}
        		index++;
        		index1=index;
        		index2=0;
        	}
        	System.out.println(num);
        }
	}

}
