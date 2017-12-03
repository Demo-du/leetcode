package leetcode;

public class N35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N35 n35 =new N35();
        int []nums={1,3,5,6};
        System.out.println(n35.searchInsert(nums, 7));
	}
    public int searchInsert(int[] nums, int target) {
    	if(nums[0]>target){
    		return 0;
    	}
    	if(nums[nums.length-1]<target){
    		return nums.length;
    	}
        return searchCore(nums,0,nums.length-1,target);
    }
    public int searchCore(int[] nums, int L,int R,int target){
    	if(L==R){
    		if(nums[L]==target){
    			return L;
    		}
    		if(nums[L]>target){
    			return L;
    		}
    		if(nums[L]<target){
    			return L+1;
    		}
    	}
    	if(nums[L]==target){
    		//System.out.println(L+"L1");
    		return L;
    	}
    	if(nums[R]==target){
    		//System.out.println(R+"R1");
    		return R;
    	}
    	if(nums[L]>target){
    		//System.out.println(L+"L2");
    		return L;
    	}
    	if(nums[R]<target){
    		//System.out.println(R+"R2");
    		return R+1;
    	}
    	int mid=(L+R)/2;
    	//System.out.println(L+" "+R+" "+mid);
    	if(nums[mid]==target){
    		//System.out.println(mid+"mid");
    		return mid;
    	}
    	if(nums[mid]>target){
    		return searchCore(nums,L,mid-1,target);
    	}
    	if(nums[mid]<target){
    		return searchCore(nums,mid+1,R,target);
    	}
    	return 0;
    }
}
