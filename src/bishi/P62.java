package bishi;

import java.util.Scanner;

public class P62 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	Zuobiao a=new Zuobiao(Float.valueOf(sc.next()),Float.valueOf(sc.next()));
        	Zuobiao b=new Zuobiao(Float.valueOf(sc.next()),Float.valueOf(sc.next()));
        	Zuobiao c=new Zuobiao(Float.valueOf(sc.next()),Float.valueOf(sc.next()));
        	Zuobiao p=new Zuobiao(Float.valueOf(sc.next()),Float.valueOf(sc.next()));
        	float signOfTrig = (b.x - a.x)*(c.y - a.y) - (b.y - a.y)*(c.x - a.x);
        	float signOfAB = (b.x - a.x)*(p.y - a.y) - (b.y - a.y)*(p.x - a.x);
        	float signOfCA = (a.x - c.x)*(p.y - c.y) - (a.y - c.y)*(p.x - c.x);
        	float signOfBC = (c.x - b.x)*(p.y - c.y) - (c.y - b.y)*(p.x - c.x);
        	boolean d1 = (signOfAB * signOfTrig > 0);
        	boolean d2 = (signOfCA * signOfTrig > 0);
        	boolean d3 = (signOfBC * signOfTrig > 0);
        	if(d1&d2&d3){
        		System.out.println("Yes");
        	}else{
        		System.out.println("No");
        	}
        }
	}

}
class Zuobiao{
	float x;
	float y;
	public Zuobiao(){}
	public Zuobiao(float x,float y){
		this.x=x;
		this.y=y;
	}
}
