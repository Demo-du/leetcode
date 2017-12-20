package bishi;

import java.util.Scanner;

public class P9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
        	nums[i]=sc.nextInt();
        }
        solve(nums);
	}
    public static void solve(int []nums){
    	int []pre=new int[nums.length];
    	int []last=new int[nums.length];
    	pre[0]=0;
    	last[nums.length-1]=0;
    	for(int i=1;i<nums.length;i++){
    		pre[i]=Math.abs(nums[i]-nums[i-1])+pre[i-1];
    	}
    	for(int i=nums.length-2;i>=0;i--){
    		last[i]=Math.abs(nums[i]-nums[i+1])+last[i+1];
    	}
    	int min=Integer.MAX_VALUE;
    	for(int i=1;i<nums.length-1;i++){
    		int select=nums[i];
    		int dis=pre[i-1]+last[i+1]+Math.abs(nums[i-1]-nums[i+1]);
    		if(dis<min){
    			min=dis;
    			//System.out.println(select);
    		}
    	}
    	System.out.println(min);
    }
}
