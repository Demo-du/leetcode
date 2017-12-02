package leetcode;

public class N34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N34 n34=new N34();
        int []nums={1};
        int []res=n34.searchRange(nums, 1);
        System.out.println(res[0]+" "+res[1]);
	}
    public int[] searchRange(int[] nums, int target) {	
    	int start=nums.length;
    	int end=-1;
    	int []num2=new int[2];
    	num2[0]=start;
    	num2[1]=end;
    	if(nums.length==0){
    		num2[0]=-1;
        	num2[1]=-1;;
    		return num2;    		
    	}
    	if(nums.length==1){
    		if(nums[0]!=target){
    			num2[0]=-1;
            	num2[1]=-1;;
    		}else{
    			num2[0]=0;
            	num2[1]=0;;
    		}
    		return num2;    		
    	}
    	searchCore(nums,num2,0,nums.length-1,target);
    	if((num2[1]==-1&&num2[0]==nums.length)){
    		num2[0]=-1;
        	num2[1]=-1;;
    		return num2;  
    	}
        return num2;

    }
    public void searchCore(int []nums,int []num2,int L,int R,int target){
    	if(L>=R){
    		return ;
    	}
    	int mid=(L+R)/2;
    	if(nums[L]==target){
    		//System.out.println(L+"L");
    		if(L>num2[1]){
    			num2[1]=L;
    		}
    		if(L<num2[0]){
    			num2[0]=L;
    		}
    	}
    	if(nums[R]==target){
    		//System.out.println(R+"R");
    		if(R>num2[1]){
    			num2[1]=R;
    		}
    		if(R<num2[0]){
    			num2[0]=R;
    		}
    	}
    	if(nums[mid]==target){
    		//System.out.println(mid+"mid");
    		if(mid>num2[1]){
    			num2[1]=mid;
    		}
    		if(mid<num2[0]){
    			num2[0]=mid;
    		}
    		searchCore(nums,num2,L,mid-1,target);
    		searchCore(nums,num2,mid+1,R,target);
    		
    	}
    	if(nums[mid]>target){//在左边
    		searchCore(nums,num2,L,mid-1,target);
    	}
    	if(nums[mid]<target){//在左边
    		searchCore(nums,num2,mid+1,R,target);
    	}
    }
}
