package leetcode;

import java.util.Arrays;

/*
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:

Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Note:

    Then length of the input array is in range [1, 10,000].
    The input array may contain duplicates, so ascending order here means <=.

Subscribe to see which companies asked this question.

 */
public class n581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []aa={2,6,4,8,10,9,15};
           System.out.println(findUnsortedSubarray(aa));
	}
   public static int findUnsortedSubarray(int[] nums) {
	   int length=nums.length;
	   int []zi=new int [length];
	   for(int i=0;i<length;i++){//重新构造一个数组
		   zi[i]=nums[i];
	   }
	   Arrays.sort(zi);
	   int s = 0,e=0;
	   for(int i=0;i<length;i++){
		   if(nums[i]==zi[i]){
			   s++;
		   }
		   else{
			   break;
		   }
	   }
	 //  System.out.println(s);
	   for(int i=length-1;i>=0;i--){
		   if(nums[i]==zi[i]){
			   e++;
		   }
		   else{
			   break;
		   }
	   }
	 //  System.out.println(e);
	   if(s!=length)
	       return (length-s-e);
	   else 
		   return (0);
    }
}
