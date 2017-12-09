package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N47 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<List<Integer>> permuteUnique(int[] nums) {
    	ArrayList<List<Integer>> total=new ArrayList<List<Integer>>();
    	ArrayList<Integer> tmp=new ArrayList<Integer>();
    	Arrays.sort(nums);
    	boolean []visited=new boolean [nums.length];
    	search(nums,total,tmp,visited);
        return total;
    }
    public void search(int[] nums,ArrayList<List<Integer>> total,ArrayList<Integer> tmp,boolean []visited){
    	if(tmp.size()==nums.length){
    		total.add(new ArrayList<Integer>(tmp));
    		return;
    	}
    	for(int i=0;i<nums.length;i++){
    		if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){//如果i-1没有被访问，然后i被访问，回溯后i-1再被访问就重复了。即（i，i-1）=（i-1,i）
    			                                       //但如该i-1被访问，然后i是可以被访问的，也就是说必须按顺序
    			continue;
    		}
    		if(!visited[i]){
    			tmp.add(nums[i]);
    			visited[i]=true;
        		search(nums,total,tmp,visited);
        		tmp.remove(tmp.size()-1);
        		visited[i]=false;
    		}
    		
    	}
    }
}
