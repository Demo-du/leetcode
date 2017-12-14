package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class P6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []nums=new int[m];
        for(int i=0;i<m;i++){
        	nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(solve(nums));
	}
    public static int solve(int []nums){
    	int maxval=0;
    	int res=-1;
    	for(int i=0;i<nums.length;i++){
    		int tmp=nums[i]*(nums.length-i);
    		if(tmp>maxval){
    			maxval=tmp;
    			res=nums[i];
    			//System.out.println(nums[i]+" "+maxval);
    		}
    	}
    	return res;
    }
}
