package leetcode;
/*
 * 字符串数组的最大公共前缀
 */
public class N14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N14 n14=new N14();
        String []strs={"a","b"};
        System.out.println(n14.longestCommonPrefix(strs));
	}
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length==0||strs==null){
    		return null;
    	}
    	String res;
    	res=strs[0];//初始的前缀
    	for(int i=0;i<strs.length;i++){
    		while(strs[i].indexOf(res)!=0){
    			res=res.substring(0, res.length()-1);
    			//System.out.println("jieguo:"+res);
    		}
    	}
        return res;
    }
}
