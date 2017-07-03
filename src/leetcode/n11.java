package leetcode;
/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
题意：在二维坐标系中，(i, ai) 表示 从 (i, 0) 到 (i, ai) 的一条线段，
任意两条这样的线段和 x 轴组成一个木桶，找出能够盛水最多的木桶，返回其容积。

两层 for 循环的暴力法会超时，所以尽早放弃这种懒惰的想法。 
http://blog.csdn.net/ljiabin/article/details/41673753 思路很好
 */
public class n11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,1,11,2};
       System.out.println(maxArea(a));
	}
	public static int maxArea(int[] height) {  
		int L=0;
		int R=height.length-1;
		int ans=0;
		int temp=0;
		if(R+1<2){
			return 0;
		}
		ans=Math.min(height[L], height[R])*(R-L);
		while(L<R){
			temp=Math.min(height[L], height[R])*(R-L);
			if(height[L]<height[R]){
				L++;
			}else{
				R--;
			}
			if(temp>ans){
				ans=temp;
			}
		}
        return ans;
    }
}
