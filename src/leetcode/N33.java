package leetcode;

public class N33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N33 n33=new N33();
        int []nums={4,5,6,1,2,3};
        System.out.println(n33.search(nums, 3));
	}
    public int search(int[] nums, int target) {
    	if(nums.length==0){
    		return -1;
    	}
       return binarysearch(nums,0,nums.length-1,target); 
    }
    public int binarysearch(int []nums,int L,int R,int target){
    	if(L>=R){
    		if(nums[L]==target){
    			return L;
    		}else{
    			return -1;
    		}
    	}
    	if(nums[L]==target){
    		return L;
    	}
    	if(nums[R]==target){
    		return R;
    	}
    	int mid=(L+R)/2;
    	if(nums[mid]==target){
    		return mid;
    	}
    	if(nums[mid]<nums[R]){//右边有序
    		if(nums[mid]<target&&target<nums[R]){
    			return binarysearch(nums,mid+1,R,target);
    		}else{
    			return binarysearch(nums,L,mid-1,target);
    		}
    	}else{//左边有序
    		if(nums[mid]>target&&target>nums[L]){
    			return binarysearch(nums,L,mid-1,target);
    		}else{
    			return binarysearch(nums,mid+1,R,target);
    		}
    	}
    	//return -1;
    }
}
