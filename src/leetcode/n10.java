package leetcode;

public class n10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("dsssss","s."));

	}
public static boolean isMatch(String s, String p) {
	    if(s.equals(p))
	    	return true;
	    if(s.length()==0&&p.length()==0){
	    	return true;
	    }
	    if(p.length()==0){
	    	return false;
	    }
	    boolean [][] res=new boolean [s.length()][p.length()];
	    for(int i=0;i<p.length()-1;i++){
	    	if(p.charAt(i)!=s.charAt(i)&&p.charAt(i)!='*'&&p.charAt(i+1)!='.'){
	    		return false;
	    	}
	    }
        return true;
    }
}
