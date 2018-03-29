package xiecheng;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s2=sc.nextLine();
        	String s1=s2.trim();
        	//System.out.println(s1);
        	String []tmp1=s1.split(" ");
        	int n=0;
        	for(int i=0;i<tmp1.length;i++) {
        		if(tmp1.length>0&&tmp1[i].charAt(0)>='0') {
        			n++;
        		}
        	}
        	//System.out.println(n);
        	int [][]juzhen=new int[n][n];
        	int index=0;
        	for(int i=0;i<n;i++) {
        		//System.out.println(tmp1[i]);
        		if(tmp1.length>0&&tmp1[i].charAt(0)>='0') {
        			juzhen[0][index]=Integer.valueOf(tmp1[i]);
        			index++;
        		}
        		else {
        			
        		}
        	}
        	for(int i=1;i<n;i++) {
        		for(int j=0;j<n;j++) {
        			juzhen[i][j]=sc.nextInt();
        		}
        	}
        	/*1  4  7　　　 　  　
        	2  5  8
        	3  6  9 */
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
    	for(int i=0;i<y;i++) {
    		for(int j=0;j<x;j++) {
    			res[i][j]=juzhen[x-j-1][i];
    		}
    	}
    	return res;
    }
}
