package leetcode;

public class N26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N26 n26=new N26();
        int []nums={1,1,2};
        System.out.println(n26.removeDuplicates(nums));
	}
    public int removeDuplicates(int[] nums) {
    	if(nums.length==0){
    		return 0;
    	}
    	int cnt=1;
    	int tmp=nums[0];
    	for(int i=1;i<nums.length;i++){
    		if(nums[i]!=tmp){
    			nums[cnt]=nums[i];
    			tmp=nums[i];
    			cnt++;
    		}
    	}
        return cnt;
    }
    /*public int removeDuplicates(int[] nums) {
    	if(nums.length==0){
    		return 0;
    	}
    	int cnt=1;
    	for(int i=0;i<nums.length;i++){
    		if(i>0&&nums[i]!=nums[i-1]){
    			cnt++;
    		}
    	}
        return cnt;
    }*/
}
