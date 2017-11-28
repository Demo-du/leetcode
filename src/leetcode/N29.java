package leetcode;

public class N29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N29 n29=new N29();
        System.out.println(n29.divide(-2147483648, -1));
	}
    public int divide(int dividend, int divisor) {
    	if(divisor==1){
    		return dividend;
    	}
    	if(divisor==-1){
    		if(dividend==Integer.MIN_VALUE){
    			return Integer.MAX_VALUE;
    		}else{
    			return -dividend;
    		}
    	}
    	int tag =1;//整数  
        long a = dividend;  
        long b = divisor;  
        if(dividend>=0&&divisor>=0||dividend<=0&&divisor<=0){  
            tag=1;  
        }else{  
            tag=-1;  
        }  
        a=Math.abs((long)a);
        b=Math.abs((long)b);
        if(a<b){  
            return 0;  
        }  
        int res=0;
        while(a>=b){
        	int tmp=1;
        	long bt=b;
        	while(a>=bt<<1){
        		bt=bt<<1;
        		tmp=tmp<<1;
        	}
        	res+=tmp;
        	System.out.println(tmp);
        	a=a-bt;
        }
       // System.out.println(Integer.MIN_VALUE);
        return res*tag;
    }
}
