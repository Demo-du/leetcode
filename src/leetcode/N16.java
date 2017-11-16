package leetcode;

import java.util.Arrays;

public class N16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N16 n16=new N16();
        int[] nums={1,1,1,0};
        System.out.println(n16.threeSumClosest(nums, 100));
	}
    public int threeSumClosest(int[] nums, int target) {
    	if(nums==null||nums.length==0){
    		return Integer.MAX_VALUE;
    	}
    	Arrays.sort(nums);
    	int res=0;
        int dis_min=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length-2;i++){
        	if (i > 0 && nums[i] == nums[i-1]){
        		continue;  
        	}
        	int index1=i+1;
            int index2=nums.length-1;
        	while(index1<index2){
            	int sum=nums[i]+nums[index1]+nums[index2];
            	if(sum>target){
            		if(sum-target<dis_min){
            			dis_min=sum-target;
            			res=sum;
            		}
            		index2--;
            	}else if(sum<target){
            		if(target-sum<dis_min){
            			dis_min=target-sum;
            			res=sum;
            		}
            		index1++;
            	}else{
            		return sum;
            	}
            }
        }
        
        return res;
    }
}
