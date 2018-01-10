package bishi;

public class P31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        solve("2AB3BCCCC");
	}
    public static void solve(String str){
    	int cnt=1;
    	for(int i=1;i<str.length();i++){
    		if(str.charAt(i)==str.charAt(i-1)){
    			cnt++;
    			if(i==str.length()-1){
    				if((str.charAt(i-1)>='a'&&str.charAt(i-1)<='z')||(str.charAt(i-1)>='A'&&str.charAt(i-1)<='Z')){
    					System.out.print(str.charAt(i-1));
            			System.out.print(cnt);
    				}
    				
    			}
    		}else{
    			if((str.charAt(i-1)>='a'&&str.charAt(i-1)<='z')||(str.charAt(i-1)>='A'&&str.charAt(i-1)<='Z')){
					System.out.print(str.charAt(i-1));
        			System.out.print(cnt);
				}
    			cnt=1;
    		}
    	}
    }
}
