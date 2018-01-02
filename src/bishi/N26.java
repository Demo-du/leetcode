package bishi;

public class N26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        solve(9);
    }
    public static void solve(int n){
    	int []dp1=new int[n+1];
    	dp1[1]=3;
    	dp1[2]=9;
    	//dp[i]=
    	for(int i=3;i<=n;i++){
    		dp1[i]=2*dp1[i-1]+dp1[i-2];
    	}
    	System.out.println(dp1[n]);
    }
}
