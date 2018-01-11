package bishi;

public class P36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        solve(6);
	}
    public static void solve(int n){
    	int []dp=new int[n+1];
    	dp[0]=0;
    	dp[1]=1;
    	//dp[2]=2;
    	for(int i=2;i<=n;i++){
    		for(int j=i-1;j>=0;j--){
    			dp[i]+=dp[j];
    		}
    		dp[i]+=1;
    	}
    	System.out.println(dp[n]);
    }
}
