package wangyi;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int N=sc.nextInt();
        	int M=sc.nextInt();
        	int [][]work=new int[N][2];
        	int []peo=new int[M];
        	int []val=new int[M];
        	for(int i=0;i<N;i++) {
        		work[i][0]=sc.nextInt();
        		work[i][1]=sc.nextInt();
        	}
        	for(int i=0;i<M;i++) {
        		peo[i]=sc.nextInt();
        	}
        	/*for(int i=0;i<N;i++) {
        		for(int j=i+1;j<N;j++) {
        			if(work[i][1]>work[j][1]) {
        				int tmp0=work[i][0];
        				int tmp1=work[i][1];
        				work[i][0]=work[j][0];
        				work[i][1]=work[j][1];
        				work[j][0]=tmp0;
        				work[j][1]=tmp1;
        			}
        		}
        	}*/
        	quickSort2(work,0,work[0].length);
        	for(int i=0;i<M;i++) {
        		for(int j=N-1;j>=0;j--) {
        			if(peo[i]>=work[j][0]) {
        				val[i]=work[j][1];
        				break;
        			}
        		}
        	}
        	for(int i=0;i<M;i++) {
        		System.out.println(val[i]);
        	}
        }
	}
	public static void quickSort2(int[][]a,int p,int r) {
    	int index1=p,index2=r;
    	int biaozhun=a[p][1];//38;//a[(p+r)/2];
    	if(p>=r) {
    		return ;
    	}
    	int cnt=0;
    	while(index1<index2) {
    		while(index1<index2&&a[index2][1]>=biaozhun) {
    			//System.out.println(a[index2]+" "+">"+"biaozhun"+biaozhun);
    			index2--;
    		}
    		if(index1<index2) {
    			swap(a,index1,index2);
    		}
    		while(index1<index2&&a[index1][1]<biaozhun) {
    			index1++;
    			//System.out.println("2");
    		}
    		//cnt++;
    		//System.out.println(cnt+" "+a[index1]+" "+a[index2]);
    		if(index1<index2) {
    			swap(a,index1,index2);
    		}
    		
    	}
    	//a[index1]=biaozhun;
    	/*for(int i=0;i<a.length;i++) {
    		System.out.println(a[i]);
    	}*/
    	quickSort2(a,p,index1-1);
    	quickSort2(a,index1+1,r);
    }
	public static void swap(int[][]work,int i,int j) {
		int tmp0=work[i][0];
		int tmp1=work[i][1];
		work[i][0]=work[j][0];
		work[i][1]=work[j][1];
		work[j][0]=tmp0;
		work[j][1]=tmp1;
	}
}
