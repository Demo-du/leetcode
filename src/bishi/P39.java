package bishi;

import java.math.BigInteger;
import java.util.Scanner;

public class P39 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        try{
        	BigInteger n=sc.nextBigInteger();
        	BigInteger b=sc.nextBigInteger();
            System.out.println(n.add(b));
        }catch(Exception e){
        	System.out.println("error");
        }
        
	}

}
