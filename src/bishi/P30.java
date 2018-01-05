package bishi;

public class P30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static void solve(int m){
    	//int []dp=new int[m+1];
    	int res=1;
    	for(int i=0;i<m;i++){
    		res*=m;
    	}
    	res=res-m+1;
    	System.out.println(res);
    }
}
