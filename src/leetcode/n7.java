package leetcode;
/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

Subscribe to see which companies asked this question.

 */
public class n7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1534236469));

	}
    public static int reverse(int x) {
    	/*if(x>0xf7777777){
    		return 0;
    	}
    	if(x<-0x80000000){
    		return 0;
    	}
    	if(x>10){
    		System.out.println("dd");
    		return x;
    	}*/
    	/*String s=String.valueOf(x);
    	String r="";
    	char []ch=s.toCharArray();
    	if(ch[0]=='-'){
    		r="-";
    		for(int i=s.length()-1;i>=1;i--){
    			r+=ch[i];
    		}
    	}else{
    		for(int i=s.length()-1;i>=0;i--){
    			r+=ch[i];
    		}
    	}
        return Integer.valueOf(r);
    }*/
    	//public int reverse(int x)
    	
    	 /*   int result = 0;

    	    while (x != 0)
    	    {
    	        int tail = x % 10;
    	        int newResult = result * 10 + tail;
    	        if ((newResult - tail) / 10 != result)
    	        { return 0; }
    	        result = newResult;
    	        x = x / 10;
    	    }

    	    return result;*/
    	if(x>Integer.MAX_VALUE){
    		
    		return 0;
    	}
    	if(x<Integer.MIN_VALUE){
    		return 0;
    	}
    	int res=0;
    	int zhiqian=0;
    	while(x!=0){
    		zhiqian=res;
    		res=zhiqian*10+x%10;
    		if((res-x%10)/10!=zhiqian){//考虑到相加后溢出
    			return 0;
    		}
    		x/=10;
    	}
    	return res;
    }
}
