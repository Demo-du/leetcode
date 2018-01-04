package bishi;

import java.util.Scanner;

public class P29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[10];
        for(int i=0;i<n;i++){
        	a[i]=sc.nextInt();
        }
        solve(n,a);
	}
    public static void solve(int n,int []a){
    	int cnt=0;
    	int l=0,r=n-1;
    	while(l<r){
    		if(a[l]<a[r]){
    			a[l+1]=a[l+1]+a[l];
    			l++;
    			cnt++;
    		}else if(a[l]>a[r]){
    			a[r-1]=a[r]+a[r-1];
    			r--;
    			cnt++;
    		}else{
    			l++;
    			r--;
    		}
    	}
    	System.out.println(cnt);
    }
}
