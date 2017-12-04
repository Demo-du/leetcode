package leetcode;

public class N38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N38 n38=new N38();
        System.out.println(n38.countAndSay(2));
	}
    public String countAndSay(int n) {
    	if(n == 1){  
            return "1";  
        } 
    	String pre=countAndSay(n-1)+" ";//后面那块是为了确保读取到最后一个数字，因为下面循环条件到pre.length()-1
    	String res="";
    	int cnt=1;
    	for(int i=0;i<pre.length()-1;i++){
    		if(pre.charAt(i)==pre.charAt(i+1)){
    			cnt++;
    		}else{
    			res=res+cnt+pre.charAt(i);
    			cnt=1;
    		}
    	}
        return res;
    }
}
