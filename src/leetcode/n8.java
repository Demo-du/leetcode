package leetcode;

public class n8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("a"));

	}
    public static int myAtoi(String str) {
    	if(str.equals("")||str.charAt(0)==' '||str.equals("+")||str.equals("-")){
    		return 0;
    	}
    	for(int i=0;i<str.length();i++){
    		if((str.charAt(i)=='-'||str.charAt(i)=='+')&&i>0){
    			return 0;
    		}
    	}
    	for(int i=0;i<str.length();i++){
    		if((Integer.valueOf(str.charAt(i))>'a'&&Integer.valueOf(str.charAt(i))<'z')){
    			return 0;
    		}
    	}
    	if(str.charAt(0)=='+'){
    		str=str.replace("+", "");
    	}
    	if(str.charAt(0)!='-'){
    		//return Integer.valueOf(str);
    	
	    	long sum=0;
	    	for(int i=str.length()-1;i>=0;i--){
	    		sum=sum*10+Integer.valueOf(str.charAt(i)+"");
	    		if(sum>Integer.MAX_VALUE){	
	    			return 0;
	    		}
	    		if(sum<Integer.MIN_VALUE){
	    			return 0;
	    		}
	    		
	    	}
    	}else{
    		long sum=0;
	    	for(int i=str.length()-1;i>=1;i--){
	    		sum=sum*10-Integer.valueOf(str.charAt(i)+"");
	    		if(sum>Integer.MAX_VALUE){	
	    			return 0;
	    		}
	    		if(sum<Integer.MIN_VALUE){
	    			return 0;
	    		}
	    		
	    	}
    	}
        return Integer.valueOf(str);
    }
}
