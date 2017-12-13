package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        	a.add(sc.nextInt());
        }
        System.out.println(solve(a));
	}
    public static int solve(ArrayList<Integer> a){
    	int []b=new int[a.size()];
    	for(int i=0;i<b.length;i++){
    		b[i]=a.get(i);
    	}
    	Arrays.sort(b);
    	int q=0;
    	int n=a.size()-1;
    	for(int i=0;i<=n;i++){
    		if(a.get(i)==b[q]){
    			q++;
    		}
    	}
    	return n-q+1;
    }
}
