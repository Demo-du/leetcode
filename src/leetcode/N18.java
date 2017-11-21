package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class N18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={0,0,0,0};
        N18 n18=new N18();
        System.out.println(n18.fourSum(nums, 0));
	}
	public List<List<Integer>> fourSum(int[] nums,int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
        int len = nums.length,
            total = 0;

        Arrays.sort(nums);
        for(int i=0;i<len-3;i++){
        	if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
        	for(int j=i+1;j<len-2;j++){//3sum
        		if(j>i+10&&nums[j]==nums[j-1]){
        			continue;
        		}
        		int L = j + 1;
                int R = len - 1;
                while(L<R){
                	total = nums[i] + nums[j] + nums[L] + nums[R];
                	if(total==target){
                		List<Integer> newlist=new ArrayList<Integer>();
                		newlist.add(nums[i]);
                		newlist.add(nums[j]);
                		newlist.add(nums[L]);
                		newlist.add(nums[R]);
                		list.add(newlist);
                		int temp1 = nums[L],
                                temp2 = nums[R];
                         while(temp1 == nums[L] && L < R) {
                                L++;
                         }
                         while(temp2 == nums[R] && L < R) {
                                R--;
                         }
                	}else if(total > target) {
                        R--;
                    }else{
                        L++;
                    }
                }
                
        	}
        }
        return list;
    }
    
}
