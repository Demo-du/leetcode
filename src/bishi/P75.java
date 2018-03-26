package bishi;

import java.util.Scanner;

public class P75 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
        	String []tmp=s.split(" ");
        	int []nums=new int[tmp.length];
        	for(int i=0;i<nums.length;i++){
        		nums[i]=Integer.valueOf(tmp[i]);
        	}
        	solve(nums,0,nums.length-1,nums.length);
        }
	}
    public static void solve(int []nums,int p,int r,int n){
    	int index1=p;
    	int index2=r;
    	int biaozhun=nums[p];
    	while(index1<index2){
    		while(index1<index2&&nums[index2]>=biaozhun){
    			index2--;
    		}
    		if(index1<index2){
    			swap(nums,index1,index2);
    		}
    		while(index1<index2&&nums[index1]<biaozhun){
    			index1++;
    		}
    		if(index1<index2){
    			swap(nums,index1,index2);
    		}
    	}
    	if(index1==n/2){
    		System.out.println(nums[index1]);
    		return;
    	}
    	if(index1>n/2){
    		solve(nums,p,index1-1,n);
    	}else{
    		solve(nums,index1+1,r,n);
    	}
    }
    public static void swap(int []nums,int p,int r){
    	int tmp=nums[p];
    	nums[p]=nums[r];
    	nums[r]=tmp;
    }
}
