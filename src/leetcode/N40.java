package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []candidates={10, 1, 2, 7, 6, 1, 5};
        N40 n40=new N40();
        System.out.println(n40.combinationSum2(candidates, 8));
	}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	int len=candidates.length;
    	List<List<Integer>> total=new ArrayList<List<Integer>>();//total
    	Arrays.sort(candidates);
    	backTracking(candidates,target,new ArrayList<Integer>() ,0,total);
        return total;
    }
    public void backTracking(int[] can,int target,List<Integer> cur, int from,List<List<Integer>> total){
    	if(target==0){
    		List<Integer> list = new ArrayList<Integer>(cur);  //目的是防止反复加入cur，造成引用传递
            total.add(list);
    	}else{
    		for(int i=from;i<can.length&&can[i]<=target;i++){
    			/*if(i>0&&can[i]==can[i-1]){
    				//i++;
    				continue;
    			}*/
    			cur.add(can[i]);
    			backTracking(can,target-can[i],cur,i+1,total);
    			cur.remove(new Integer(can[i]));//这里需要new Integer包装
    			while(i<can.length-1&&can[i]==can[i+1]){
    				i++;
    			}
    		}
    	}
    }
}
