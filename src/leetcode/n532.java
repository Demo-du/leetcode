package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*
 Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:

Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.

Example 2:

Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

Example 3:

Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).

Note:

    The pairs (i, j) and (j, i) count as the same pair.
    The length of the array won't exceed 10,000.
    All the integers in the given input belong to the range: [-1e7, 1e7].

Subscribe to see which companies asked this question.

 */
public class n532 {
     public static void main(String []args){
    	 int []c={1, 3, 1, 5, 4};
    	 System.out.println(findPairs(c,0));
     }
     public static int findPairs(int[] nums, int k) {
    	 int n=nums.length;
    	 HashMap<Integer,Integer> cc=new HashMap<Integer,Integer>();
    	 for(int i=0;i<n;i++){
    		 for(int j=0;j<n;j++){
    			 if(nums[i]-nums[j]==k&&i!=j){
    				 cc.put(nums[i], i);
    			 }
    		 }

    	 }
    	 if(k>=0)
           return cc.size();
    	 else 
    		 return 0;
     }
}




