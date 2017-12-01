package leetcode;

import java.util.Stack;

public class N32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="()()";
        N32 n32=new N32();
        System.out.println(n32.longestValidParentheses(s));
	}
    public int longestValidParentheses(String s) {
    	int min=0;
    	int min_tmp=0;
    	Stack<Integer> stack   = new Stack<Integer>();  
    	for(int i=0;i<s.length();i++){
    		if(s.charAt(i)==')'){
    			if(!stack.isEmpty()){
    				//min_tmp=0;
    				stack.pop();
    				min_tmp+=2;
    				if(stack.isEmpty()){
    					min=Math.max(min, min_tmp);
    				}else{
    					min=Math.max(min, i-stack.peek());
    				}
    				
    			}else{
    				min_tmp=0;
    			}
    			
    		}else{
    				stack.push(i);
    		}
    	}
        return min;
    }
}
