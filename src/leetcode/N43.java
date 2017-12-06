package leetcode;

public class N43 {

	/**
	 * @param args
	 * 思路：http://www.cnblogs.com/TenosDoIt/p/3735309.html
	 * 大数乘法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String num1="11";
        String num2="2";
        N43 n43 =new N43();
        System.out.println(n43.multiply(num1, num2));
	}
    public String multiply(String num1, String num2) {
    	if(num1 == null || num2 == null || num1.length()==0 || num2.length()==0)  
            return "";  
        if(num1.charAt(0)=='0')  
            return "0";  
        if(num2.charAt(0)=='0')  
            return "0";  
    	num1=new StringBuilder(num1).reverse().toString();
    	num2=new StringBuilder(num2).reverse().toString();
    	int []res=new int[num1.length()+num2.length()];
    	for(int i=0;i<num1.length();i++){
    		int a1=num1.charAt(i)-'0';
    		for(int j=0;j<num2.length();j++){
    			int a2=num2.charAt(j)-'0';
    			res[i+j]+=a1*a2;
    		}
    	}
    	StringBuilder str=new StringBuilder();
    	for(int i=0;i<res.length;i++){
    		int dig=res[i]%10;
    		int inc=res[i]/10;
    		char tmp=(char) (dig+'0');
    		str.insert(0, tmp);//直接插入数字,不需要字符
    		//str.append(dig);
    		//System.out.println(dig+" "+str);
    		if(i<res.length-1){
    			res[i+1]+=inc;
    		}
    	}
    	//System.out.println(str);
    	//str.reverse();
    	while(str.charAt(0)=='0'){
    		str.deleteCharAt(0);
    	}
        return str.toString();
    }
}
