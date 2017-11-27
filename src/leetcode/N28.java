package leetcode;

public class N28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N28 n28=new N28();
        System.out.println(n28.strStr("mississippi", "pi"));
	}
    public int strStr(String haystack, String needle) {
    	if(needle.length()==0){
    		return 0;
    	}
    	if(haystack.length()==0){
    		return -1;
    	}
    	if(needle.length()>haystack.length()){
    		return -1;
    	}
    	if(needle.length()==haystack.length()){
    		if(needle.equals(haystack)){
    			return 0;
    		}else{
    			return -1;
    		}
    	}
    	//System.out.println("ss");
    	char []a1=haystack.toCharArray();
    	char []a2=needle.toCharArray();
    	for(int i=0;i<a1.length-a2.length+1;i++){
    		if(a1[i]==a2[0]){
    			//System.out.println(i);
    			int n=0;
    			for(int j=0;j<a2.length;j++){
    				//System.out.println(i+" "+a1[i+j]+" "+a2[j]);
    				if(a1[i+j]!=a2[j]){
    					break;
    				}
    				n=j;
    			}
    			//System.out.println(n);
    			if(n==a2.length-1){
    				return i;
    			}
    		}
    	}
        return -1;
    }
}
