package leetcode;

public class N45 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int jump(int[] nums) {  
        if (nums == null || nums.length == 0) {  
            return -1;  
        }  
        // cur是维护的当前能跳到的最大位置  
        // 第step+1步，能到达的最远距离  
        int cur = 0;  
        // last是指从之前的点能reach到得最远位置  
        // 已经可以到达的最大距离  
        int last = 0;  //最远距离
        int step = 0;  
        for(int i=0;i<nums.length;i++){
        	if(i>last){
        		step++;
        		last=cur;
        	}
        	cur=Math.max(cur, nums[i]+i);
        }
        return step;
    }  
}
