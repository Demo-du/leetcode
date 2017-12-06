package leetcode;

public class N42 {

	/**
	 * @param args
	 * http://blog.csdn.net/linhuanmars/article/details/20888505
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
     public int trap(int[] height) {
	    if(height.length<3){
	    	return 0;
	    }
	    int L_max=0;
	    int R_max=0;
	    int res=0;
	    int []con=new int[height.length];
	    for(int i=0;i<height.length;i++){
	    	con[i]=L_max;
	    	L_max=Math.max(height[i], L_max);
	    }
	    for(int i=height.length-1;i>=0;i--){
	    	con[i]=Math.min(con[i], R_max);//左右最大值小的那个
	    	R_max=Math.max(R_max, height[i]);
	    	if(con[i]-height[i]>0){//水平面高于现在的高度
	    		res+=con[i]-height[i];
	    	}
	    }
        return res;
    }
}
