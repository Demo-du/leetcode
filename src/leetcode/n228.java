package leetcode;
import java.util.ArrayList;
/*
Given a sorted integer array without duplicates, return the summary of its ranges.

For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.

Subscribe to see which companies asked this question.

 */
import java.util.List;

public class n228 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums={0,1,2,4,6,7};
        System.out.println(summaryRanges(nums));
        //summaryRanges
	}
    public static List<String> summaryRanges(int[] nums) {
    	List<String> list=new ArrayList();
    	if(nums.length==1){
    		list.add(nums[0]+"");
    		return list;
    	}
        for(int i=0;i<nums.length;i++){
        	int a=nums[i];
        	while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
        		i++;
        	}
        	if(a!=nums[i]){
        		list.add(a+"->"+nums[i]);
        	}else{
        		list.add(a+"");
        	}
        }
        return list;
    /*	List<String> list=new ArrayList();
    	if(nums.length==1){
    		list.add(nums[0]+"");
    		return list;
    	}
    	int s=0;
    	int tt=0;//长度
    	for(int i=0;i<nums.length-1;i++){
    		//int aa=nums
    		
    		if(nums[i+1]-nums[i]!=1){//bu连续
    			if(tt>0)
    			  list.add(nums[s]+"->"+nums[i]);
    			else
    				list.add(nums[s]+"");
    			s=i+1;
    			tt=0;
    		}else{
    			tt++;
    		}
    	}
    	if(tt==0){
    		list.add(nums[nums.length-1]+"");
    	}else{
    		list.add(nums[s]+"->"+nums[nums.length-1]);
    	}
    	return list;*/
    }
}





