package leetcode;

public class N41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []nums={3,4,-1,1};
        N41 n41=new N41();
        System.out.println(n41.firstMissingPositive(nums));
	}
    public int firstMissingPositive(int[] nums) {
    	if(nums.length==0||nums==null){
    		return 1;
    	}
    	int index = 0;
        while (index < nums.length) {
            if (nums[index] != index + 1 && nums[index] > 0 && nums[index] <= nums.length && nums[index] != nums[nums[index] - 1]) {
                swap(nums,index, nums[index] - 1);//保证交换后的正数，均符合要求，然后index++
            } else {
                ++ index;
            }
        }
    	for( index=0;index<nums.length;index++){
    		if(nums[index]!=index+1){
    			return index+1;
    		}
    	}
        return index+1;
    }
    public void swap(int[] nums,int i,int j){
    	int tmp=nums[i];
    	nums[i]=nums[j];
    	nums[j]=tmp;
    }
}
