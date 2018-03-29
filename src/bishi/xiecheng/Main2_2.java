package xiecheng;

import java.util.Scanner;

public class Main2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
        	String s1=sc.nextLine();
        	String []tmp1=s1.split(" ");
        	int n=tmp1.length;
        	String [][]tmp2=new String[n][n];
        	int [][]juzhen=new int[n][n];
        	for(int i=0;i<n;i++) {
        		juzhen[0][i]=Integer.valueOf(tmp1[i]);
        	}
        	for(int i=1;i<n;i++) {
        		tmp2[i]=sc.nextLine().split(" ");
        	}
        	for(int i=1;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			juzhen[i][j]=Integer.valueOf(tmp2[i][j]);
        		}
        	}
        	int [][]res=zhuanhuan(juzhen);
        	for(int i=0;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			if(j!=n-1) {
        				System.out.print(res[i][j]+" ");
        			}else {
        				System.out.print(res[i][j]);
        			}
        			
        		}
        		System.out.println();
        	}
        }
	}
    public static int[][] zhuanhuan(int[][]juzhen) {
    	int x=juzhen[0].length;
    	int y=juzhen.length;
    	int [][]res=new int[x][y];
    	int tt=x-1;
    	for(int i=0;i<y;i++,tt--) {
    		for(int j=0;j<x;j++) {
    			res[j][tt]=juzhen[i][j];
    		}
    	}
    	return res;
    }
}
