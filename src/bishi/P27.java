package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P27 {
     public static void main(String []args){
    	// System.out.println(solveDP(4,24));
    	 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 int m=sc.nextInt();
    	 solve(n,m);
     }
     public static void solve(int n,int m){
    	 int []dp=new int[m+1];
    	 for(int i=0;i<=m;i++){
    		 dp[i]=100000;
    	 }
    	 dp[n]=0;
    	 for(int i=n;i<=m;i++){
    		/* if(dp[i] == 100000){ // 该位置不能像前走
                 dp[i] = 0;
                 continue;
             }*/
    		 ArrayList<Integer> yueshu=get(i);
    		 for(int j=0;j<yueshu.size();j++){
    			 if(i+yueshu.get(j)<=m){
    				 if(dp[i+yueshu.get(j)]>dp[i]+1){
    					 dp[i+yueshu.get(j)]=dp[i]+1;
    				 }
    			 }
    		 }
    	 }
    	 if(dp[m]==100000){
    		 dp[m]=-1;
    	 }
    	 System.out.println(dp[m]);
     }
     private static ArrayList<Integer> get(int n){
         ArrayList<Integer> list=new ArrayList<Integer>();
         for(int i=2;i<=Math.sqrt(n);i++){      //求所有约数
             if(n%i==0){
                 list.add(i);
                     if(n/i!=i){
                         list.add(n/i);
                     }
             }
         }
         return list;
     }
}
