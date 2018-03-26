package bishi;

import java.util.Scanner;

public class P74 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
        	String []str=s.split(" ");
        	int []nums=new int[str.length-1];
        	for(int i=0;i<str.length-1;i++){
        		nums[i]=Integer.valueOf(str[i]);
        	}
        	int k=Integer.valueOf(str[str.length-1]);
        	int []a=new int[k];
        	for(int i=0;i<k;i++){
        		a[i]=nums[i];
        	}
        	for(int i=k/2-1;i>=0;i--){
        		adjmin(a,i,k-1);
        	}
        	for(int i=k;i<nums.length;i++){
        		if(nums[i]<a[0]){
        			a[0]=nums[i];
        			adjmin(a,0,k-1);
        		}
        	}
        	for(int i=0;i<a.length;i++){
        		System.out.print(a[i]+" ");
        	}
        }
	}
    public static void adjmin(int[]a,int pos,int len){
    	int tmp;
    	int child;
    	for(tmp=a[pos];2*pos+1<=len;pos=child){
    		child=2*pos+1;
    		if(child<len&&a[child]<a[child+1]){
    			child++;
    		}
    		if(a[child]>tmp){
    			a[pos]=a[child];
    		}else{
    			break;
    		}
    	}
    	a[pos]=tmp;
    }
}
