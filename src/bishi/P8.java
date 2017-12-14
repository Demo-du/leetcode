package bishi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class P8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeSet<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<n;i++){
			set.add(sc.nextInt());
		}
		System.out.println(solve(set));
	}
    public static int solve(TreeSet<Integer> set){
    	int i=0;
    	for(int a:set){
    		i++;
    		if(i==3){
    			return a;
    		}
    	}
    	return -1;
    }
}
