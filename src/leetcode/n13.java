package leetcode;

public class n13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        n13 n=new n13();
        System.out.println(n.romanToInt(""));
	}
    public int romanToInt(String s) {
    	int res=chartoint(s.charAt(0));
    	int pre=0;
    	int now=1;
    	for(int i=1;i<s.length();i++){
    		pre=chartoint(s.charAt(i-1));
    		now=chartoint(s.charAt(i));
    		if(pre>=now){
    			res+=now;
    		}else{
    			res=res-pre+now-pre;
    		}
    	}
        return res;
    }
    public int chartoint(char a){
    	int data=0;
    	switch(a){
	    	case 'I':  
	            data = 1;  
	            break;  
	        case 'V':  
	            data = 5;  
	            break;  
	        case 'X':  
	            data = 10;  
	            break;  
	        case 'L':  
	            data = 50;  
	            break;  
	        case 'C':  
	            data = 100;  
	            break;  
	        case 'D':  
	            data = 500;  
	            break;  
	        case 'M':  
	            data = 1000;  
	            break;  
    	}
    	return data;
    }
}
