package jingdong;

import java.util.Scanner;

public class Main1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.nextLine();
        	char []tmp=s.toCharArray();
        	int changdu=s.length();
        	long [][]help=new long[changdu][changdu];
        	for(int i=0;i<changdu;i++) {
        		help[i][i]=1;
        	}
        	for(int i=changdu-1;i>=0;i--) {
        		for(int j=i+1;j<changdu;j++) {
        			help[i][j]=help[i+1][j]+help[i][j-1]-help[i+1][j-1];
        			if(tmp[i]==tmp[j]) {
        				help[i][j]=help[i][j]+help[i+1][j-1]+1;
        			}
        		}
        	}
        	System.out.println(help[0][changdu-1]);
        }
	}

}
