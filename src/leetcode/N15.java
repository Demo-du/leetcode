package leetcode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 */
public class N15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N15 n15=new N15();
        int []nums={0,0,0,0};
        System.out.println(n15.threeSum(nums));
	}
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> total=new LinkedList<List<Integer>>();
    	for(int i=0;i<nums.length;i++){
    		if(i>0&&nums[i]==nums[i-1]){
    			continue;
    		}
    		//System.out.println("ss");
    		List<List<Integer>> totaltemp=find(i,nums,i+1,nums.length-1);
    		for(List<Integer> temp:totaltemp){
    			//System.out.println(temp);
    			if(temp.size()>0){
 	    		   total.add(temp);
 	    		   
    			}
    				

    			
    		}
    	}
        return total;
    }
    public List<List<Integer>> find(int i,int[] nums,int index1,int index2){
    	List<Integer> newList=new LinkedList<Integer>();
    	List<List<Integer>> total=new LinkedList<List<Integer>>();
    	while(index1<index2){
    		//System.out.println("ss");
    		if(nums[index1]+nums[index2]+nums[i]>0){
    			index2--;
    		}else if(nums[index1]+nums[index2]+nums[i]<0){
    			index1++;
    		}else{
    			//System.out.println(nums[i]);
    			newList=new LinkedList<Integer>();
    			newList.add(nums[i]);
    			newList.add(nums[index1]);
    			newList.add(nums[index2]);
    			total.add(newList);
                index1++;
                while(nums[index1]==nums[index1-1]&&index1<index2){
                	index1++;
                }
    		}
    	}
    	return total;
    }
}
