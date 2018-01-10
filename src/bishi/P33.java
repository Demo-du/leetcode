package bishi;

import java.util.Scanner;

public class P33 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		solve(sc.nextLine());
	}
    public static void solve(String str){
    	int len=0;
    	for(int i=str.length()-1;i>=0;i--){
    		if(str.charAt(i)!=' '){
    			len++;
    			if(i==0){
    				System.out.print(len);
    			}
    		}else{
    			System.out.print(len);
    			break;
    		}
    	}
    }
}
