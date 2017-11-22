package leetcode;

import java.util.Stack;

public class N20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N20 n20=new N20();
        System.out.println(n20.isValid("(("));
	}
    public boolean isValid(String s){
    	boolean res=true;
    	if(s.length()<=1){
    		return false;
    	}
    	char temp=s.charAt(0);
    	Stack<Character> stack=new Stack<Character>();
    	//stack.add(temp);
    	for(int i=0;i<s.length();i++){
    		temp=s.charAt(i);
    		if(temp!=')'&&temp!='}'&&temp!=']'){
    			stack.add(temp);
    		}else{
    			if(stack.size()==0){
    				return false;
    			}
    			char top=stack.pop();
    			switch(top){
    			   case '(':
    				   if(temp!=')'){
    					   return false;
    				   }
    				   break;
    			   case '[':
    				   if(temp!=']'){
    					   return false;
    				   }
    				   break;
    			   case '{':
    				   if(temp!='}'){
    					   return false;
    				   }
    				   break;
    			}
    		}
    	}
    	if(stack.size()==0){
    		return true;
    	}else{
    		return false;
    	}
    	
    }
}
