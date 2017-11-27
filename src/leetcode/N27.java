package leetcode;

public class N27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int removeElement(int[] nums, int val) {
    	if(nums.length==0){
    		return 0;
    	}
    	int cnt=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=val){
    			nums[cnt]=nums[i];
    			cnt++;
    		}
    	}
        return cnt;
    }
}
