package leetcode;

import java.util.ArrayList;
import java.util.List;
/*
 * 任何位置左括号数量大于等于右括号()()
 */
public class N22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<String> generateParenthesis(int n){
    	List<String> res=new ArrayList<String>();
    	generate(n,n,"",res);
    	return res;
    }
    public void generate(int num_L,int num_R,String s,List<String> res){
    	if(num_R==0&&num_L==0){
    		res.add(s);
    	}
    	if(num_L>0){
    		generate(num_L-1,num_R,s+"(",res);
    	}
    	if(num_R>0&&num_L<num_R){
    		generate(num_L,num_R-1,s+")",res);
    	}
    	
    }
}
