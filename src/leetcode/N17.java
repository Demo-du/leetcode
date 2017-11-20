package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String digits="23";
        N17 n17=new N17();
        System.out.println(n17.letterCombinations(digits));
	}
    public List<String> letterCombinations(String digits){
    	String []tables=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	List<String> list=new ArrayList<String>();
    	String str="";
    	combi(list,digits,tables,0,str);
    	return list;
    }
    public void combi(List<String> list,String digits,String []tables,int index,String str){
    	if(index==digits.length()){
    		//list.add(e)
    		if(str.length()!=0){
    			list.add(str);
    		}
    		return ;
    	}
    	String temp=tables[digits.charAt(index)-'0'];//第index个数对应的字符串
    	for(int i=0;i<temp.length();i++){
    		String newString=str+temp.charAt(i);
    		combi(list,digits,tables,index+1,newString);
    	}
    	
    }
}
