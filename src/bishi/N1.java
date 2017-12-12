package bishi;
/*
 * 2017 京东秋招笔试
 */
public class N1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N1 n1=new N1();
        n1.print(5);
	}   
	public int hexsum(int n,int a){
		int res=0;
		while(n>0){
			res+=n%a;
			n/=a;
		}
		return res;
	}
	void print(int A){
		int sum=0;
		for(int i=2;i<=A-1;i++){
			sum+=hexsum(A,i);
		}
		int r=gcd(sum,A-2);
		System.out.println(sum/r+"/"+(A-2)/r);
	}
	public int gcd(int a,int b){
		int n=Math.min(a, b);
		int res=1;
		while(n>0){
			if(a%n==0&&b%n==0){
				res=n;
				break;
			}
			n--;
		}
		return res;
	}
}
