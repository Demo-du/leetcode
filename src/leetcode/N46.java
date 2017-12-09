package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N46 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={1,2,3};
        N46 n46 =new N46();
        System.out.println(n46.permute(nums));
	}
    public List<List<Integer>> permute(int[] nums) {
    	ArrayList<List<Integer>> total=new ArrayList<List<Integer>>();
    	ArrayList<Integer> tmp=new ArrayList<Integer>();
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
