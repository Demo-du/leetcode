package xiecheng;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	boolean []chose=new boolean[n];
        	int [][]fang=new int[n][3];
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			fang[i][j]=sc.nextInt();
        		}
        	}
        	System.out.println(-1);
        }
	}

}
