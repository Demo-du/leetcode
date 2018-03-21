package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class P60 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isshuxiian(370));
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int m=sc.nextInt();
        	int n=sc.nextInt();
        	ArrayList<Integer> res=new ArrayList<Integer>();
        	for(int i=m;i<=n;i++){
        		if(isshuxiian(i)){
        			res.add(i);
        		}
        	}
        	if(res.size()==0){
        		System.out.println("no");
        	}else{
        		for(int i:res){
        			System.out.print(i+" ");
        		}
        		System.out.println();
        	}
        	
        }
	}
    public static boolean isshuxiian(int x){
    	int tmp=0;
    	int yuan=x;
    	while(x>0){
    		int k=x%10;
    		tmp+=Math.pow(k, 3);
    		x=x/10;
    	}
    	
    	if(yuan==tmp){
    		return true;
    	}
    	return false;
    }
}
