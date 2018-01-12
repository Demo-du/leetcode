package bishi;

public class P38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        solve(5);
	}
    public static void solve(int n){
    	int []num={1,5,10,20,50,100};
    	int [][]dp=new int[6][n+1];
    	for(int i=0;i<n+1;i++){
        	dp[0][i]=1;
        }
    	for(int i=1;i<6;i++){
    		for(int j=1;j<=n;j++){
    			for(int k=0;k<=j/num[i];k++){
    				dp[i][j]+=dp[i-1][j-k*num[i]];
    			}
    		}
    	}
    	System.out.println(dp[5][n]);
    }
    public static void solve2(int n){
    	int []num={1,5,10,20,50,100};
    	int [][]dp=new int[6][n+1];
    	for(int i=0;i<n+1;i++){
        	dp[0][i]=1;
        }
    	for(int i=1;i<6;i++){
    		for(int j=1;j<=n;j++){
    			for(int k=0;k<=j/num[i];k++){
    				dp[i][j]+=dp[i-1][j-k*num[i]];
    			}
    		}
    	}
    	System.out.println(dp[5][n]);
    }
}
