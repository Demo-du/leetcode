package leetcode;
import java.util.*;
/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

Subscribe to see which companies asked this question.

 */
public class n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int lengthOfLongestSubstring(String s) {
    	int len1,len2;
    	HashMap<String,Integer> tmp=new HashMap<String,Integer>();
    	String []h=s.split("");
    	for(String i:h){
    		tmp.put(i, 0);
    	}
    	for(int i=0;i<s.length();i++){
    		if(tmp.get(h[i]) != null&&tmp.get(h[i])==0){//
    			
    			
    		}
    	}
        return 0;
    } 
}
