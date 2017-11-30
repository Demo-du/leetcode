package leetcode;

import java.util.Arrays;

public class N31 {

	/**
	 * @param args
	 *把数组看做一个数字，尽量使数字在低位部分的元素变大来增大数字的大小。
	 *132->213
	 *http://blog.csdn.net/chilseasai/article/details/48163333
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={1,3,2};
        N31 n31=new N31();
        n31.nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
        	System.out.print(nums[i]+" ");
        }
	}
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int index=0;
        int index2=len-1;
        int min=Integer.MAX_VALUE;
        for(int i=len-2;i>=0;i--){
        	if(nums[i]<nums[i+1]){
        		for(int j=len-1;j>=i;j--){
        			if(nums[j]>nums[i]&&nums[j]<min){
        				index2=j;
        				min=nums[j];
        			}
        		}
        		swap(nums,i,index2);
        		index=i+1;
        	//	System.out.println(index);
        		break;
        	}else{
        		
        	}
        }
        sort(nums,index);
    }
    public void swap(int []nums,int i,int j){
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    }
    public void sort(int []nums,int s){
    	int len=nums.length;
    	int []tmp=new int[len-s];
    	for(int i=0,j=s;j<len;i++,j++){
    		tmp[i]=nums[j];
    	}
    	Arrays.sort(tmp);
    	for(int i=0,j=s;j<len;i++,j++){
    		nums[j]=tmp[i];
    	}
    }
}
