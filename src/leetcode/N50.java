package leetcode;

public class N50 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double myPow(double x, int n) {
		if (n < 0) return 1 / pow(x, -n);
        return pow(x, n); 
	}
	public double pow(double x, int n){
		if(n==0){
			return 1;
		}
		double half=pow(x,n/2);
		if((n&1)==0){
			return half*half;
		}
		return x*half*half;
	}
}
