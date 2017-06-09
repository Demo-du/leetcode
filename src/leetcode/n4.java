package leetcode;

import java.util.Arrays;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays.
 The overall run time complexity should be O(log (m+n)).

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

Subscribe to see which companies asked this question.

 */
public class n4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int n=nums1.length;
    	int m=nums2.length;
    	int []mid=new int [m+n];  
    	for(int i=0;i<n;i++){
    		mid[i]=nums1[i];
    	}
    	for(int i=0;i<m;i++){
    		mid[n+i]=nums2[i];
    	}
    	Arrays.sort(mid);
    	int len=mid.length;
    	if(len%2==0){
    		return (mid[len/2]+mid[len/2-1])/2.0;
    	}else
    	  return mid[len/2];
    }
}
