package leetcode;

public class n9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(22));

	}
    public static boolean isPalindrome(int x) {
    	/*这种方法也可以，不过比较麻烦
    	String s=String.valueOf(x);
    	if(s.charAt(0)!='-'){
    		if(s.length()%2==0){
    			int i=s.length()/2;
    			int j=s.length()/2-1;
    			while(i<s.length()&&j>=0){
    				if(s.charAt(i)!=s.charAt(j)){
    					return false;
    				}
    				i++;
    				j--;
    			}
    		}else{
    			int i=s.length()/2;
    			int j=s.length()/2;
    			while(i<s.length()&&j>=0){
    				if(s.charAt(i)!=s.charAt(j)){
    					return false;
    				}
    				i++;
    				j--;
    			}
    		}
    	}else{
    		return false;
    	}
        return true;
    }*/
    	if(x<0){
    		return false;
    	}
    	int init=x;
    	int temp=0;
    	while(x!=0){
    		temp=temp*10+x%10;
    		x/=10;
    	}
    
    	if(temp!=init)
    		return false;
    	return true;
    }
}
