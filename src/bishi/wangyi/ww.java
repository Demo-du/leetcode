import java.util.Scanner;

public class Main {

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
        	for(int i=0;i<N;i++) {
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
        	}
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

}
