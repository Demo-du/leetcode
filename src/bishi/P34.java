package bishi;

import java.util.Scanner;

public class P34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String pat=sc.nextLine();
        for(char x:pat.toCharArray()){
        	solve(str,x);
        }
	}
    public static void solve(String str,char x){
    	char []arr=str.toCharArray();
    	int i=0;
    	int num=-1;
    	for(i=0;i<str.length();i++){
    		if(arr[i]==x){
    			num=arr[str.length()-1]-arr[i+1]+1;
    		}
    	}
    	System.out.print(num);
    }
}
