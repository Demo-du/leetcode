package leetcode;

public class N44 {

	/**
	 * @param args
	 * http://shmilyaw-hotmail-com.iteye.com/blog/2154716
	 * 
F[i, j] = F[i-1, j-1] &&(s[i] == p[j] || p[j] == '?')  (假设此时p[j] != '*')

F[i, j] = or F[i-1, j-1] for i = 0, ... i-1, 如果p[j] = '*'。
这里表示我们从前面开始找到一个对应j-1时为true的情况，表示对应i-1的时候s串匹配的位置，则从这个位置后面所有的位置都是true。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean isMatch(String s ,String p){
    	int m=s.length();
    	int n=p.length();
    	boolean [][]dp=new boolean[m+1][n+1];
    	dp[0][0] = true;  
    	for (int j = 1; j <= n; j++)  
            dp[0][j] = dp[0][j - 1] && p.charAt(j - 1) == '*';  
    	for(int i = 1; i <= m; i++) {  
            for(int j = 1; j <= n; j++) {  
                if(p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '?')  
                    dp[i][j] = dp[i - 1][j - 1];  
                else if(p.charAt(j - 1) == '*')   
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];  
            }  
        }  
        return dp[m][n]; 
    }
}
