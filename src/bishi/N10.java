package bishi;

import java.util.Scanner;

public class N10 {

	/**
	 * 5
R 0 0 0
R 0 4 0
R 0 0 3
G 92 14 7
G 12 16 8
	 * 寻找三角形
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        char []type=new char[N];
        int []x=new int[N];
        int []y=new int[N];
        int []z=new int[N];
        for(int i=0;i<N;i++){
        	String tmp=sc.next();
        	type[i]=tmp.charAt(0);
        	x[i]=sc.nextInt();
        	y[i]=sc.nextInt();
        	z[i]=sc.nextInt();
        }
        solve(type,x,y,z,N);
	}
    public static void solve(char []type,int []x,int []y,int []z,int N){
    	double res=0;
    	for(int i=0;i<N;i++){
    		for(int j=0;j<i;j++){
    			for(int k=0;k<j;k++){
    				boolean ok=false;
    				if(type[i]==type[j]&&type[j]==type[k]){
    					ok=true;
    				}
    				if(type[i]!=type[j]&&type[j]!=type[k]&&type[i]!=type[k]){
    					ok=true;
    				}
    				if(ok){
    					double d1=Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j])+(z[i]-z[j])*(z[i]-z[j]));
    					double d2=Math.sqrt((x[i]-x[k])*(x[i]-x[k])+(y[i]-y[k])*(y[i]-y[k])+(z[i]-z[k])*(z[i]-z[k]));
    					double d3=Math.sqrt((x[k]-x[j])*(x[k]-x[j])+(y[k]-y[j])*(y[k]-y[j])+(z[k]-z[j])*(z[k]-z[j]));
    					double p=(d1+d2+d3)/2.0;
    					double sq=Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
    					if(sq>res){
    						res=sq;
    					}
    				}
    			}
    		}
    	}
    	System.out.println(res);
    } 
}
