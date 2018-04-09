package jingdong;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	String []str=new String[n];
        	for(int i=0;i<n;i++) {
        		str[i]=sc.next();
        	}
        	for(int i=0;i<n;i++) {
        		pritn(str[i]);
        	}
        }
	}
	public static void pritn(String s) {
		char []str=s.toCharArray();
		int cnt=0;
		int flag=0;
		for(int i=0;i<s.length();i++) {
			if(str[i]==')') {
				cnt--;
			}
			if(str[i]=='(') {
				cnt++;
			}
			if(cnt<-1) {
				flag=1;
				System.out.println("No");
				break;
			}
		}
		if(flag==0&&cnt==0) {
			System.out.println("Yes");
		}
		if(flag==0&&cnt!=0) {
			System.out.println("No");
		}
		flag=0;
	}

}
