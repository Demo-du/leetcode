package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ceshi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        	int n=sc.nextInt();
        	int v=sc.nextInt();
        	int []tiji=new int[n];
        	int []val=new int[n];
        	for(int i=0;i<n;i++){
        		tiji[i]=sc.nextInt();
        		val[i]=sc.nextInt();
        	}
        	String[][]chose=new String[n][v+1];
        	for(int i=0;i<n;i++){
        		for(int j=0;j<v+1;j++){
        			chose[i][j]="";
        		}
        		
        	}
        	int tmp_v=0;
        	int [][]F=new int[n][v+1];
        	for(int i=1;i<n;i++){
        		for(int j=1;j<v+1;j++){
        			if(j<tiji[i]){
        				F[i][j]=F[i-1][j];
        				chose[i][j]=chose[i-1][j];
        			}else {
        				if(F[i-1][j]>F[i-1][j-tiji[i]]+val[i]){
        					F[i][j]=F[i-1][j];
        					chose[i][j]=chose[i-1][j];
        				}else{
        					F[i][j]=F[i-1][j-tiji[i]]+val[i];
        					chose[i][j]=chose[i-1][j-tiji[i]]+" "+(i+1);
        				}
        			}
        		}
        	}
        	System.out.println(F[n-1][v]);
        	String[]hh=chose[n-1][v].split(" ");
        	ArrayList<Integer> h2=new ArrayList<Integer>();
        	for(int i=0;i<hh.length;i++){
        		if(hh[i].length()>0){
        			h2.add(Integer.valueOf(hh[i]));
        			//System.out.println("ss"+hh[i]);
        		}
        		
        	}
        	Collections.sort(h2);
        	for(int i=0;i<h2.size();i++){
        		System.out.println(h2.get(i));
        	}
        }
	}
	

}
