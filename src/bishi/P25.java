package bishi;

public class P25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        P25 p25=new P25();
        p25.solve(-103);
	}
    public void solve(int n){
    	int intn=0;
    	while(n!=0){
    		int tmp=n%10;
    		intn=intn*10+tmp;
    		n=n/10;
    	}
    	System.out.println(intn);
    }
}
