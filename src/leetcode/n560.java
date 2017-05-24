package leetcode;
/*
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:

Input:nums = [1,1,1], k = 2
Output: 2

Note:

    The length of the array is in range [1, 20,000].
    The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].

Subscribe to see which companies asked this question.

 */
public class n560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int subarraySum(int[] nums, int k) {
    	int n=nums.length;
    	
    	int so=0;
    	for(int i=0;i<n;i++){
    		int sum=0;
    		for(int j=i;j<n;j++){
    			sum=sum+nums[j];
        		if(sum==k){
        			so++;
        			//break;
        		}
    		}
    	}
        return so;
    }
}
