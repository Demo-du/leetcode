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
		System.out.println(lengthOfLongestSubstring("csddwasc"));

	}
    public static int lengthOfLongestSubstring(String s) {
    	int len1=0,len2=0;
    	int start=0;
    	HashMap<Character,Integer> tmp=new HashMap<Character,Integer>();
    //	HashSet<Character> tt=new HashSet<Character>();
    	char [] zu=s.toCharArray();
    	for(int i=0;i<zu.length;i++){
    		if(tmp.containsKey(zu[i])){
    			//start=tmp.get(zu[i]);
    			start=Math.max(start,tmp.get(zu[i])+1);
    			//start=i+1;
    		
    		}
    		tmp.put(zu[i], i);
    		len2=Math.max(len2, i-start+1);
    		
    	}
        return len2;
    } 
}
