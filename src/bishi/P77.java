package bishi;

import java.util.ArrayList;
import java.util.Scanner;

public class P77 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	int tmp=1;
        	int index1=1;
        	int index2=1;
        	ArrayList<Integer> list;//=new ArrayList<Integer>();
        	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        	while(index1<=n&&index2<=n){
        		if(index1==index2){
        			if(index1==m){
        				list=new ArrayList<Integer>();
        				list.add(index1);
        				res.add(list);
        				break;
        			}else{
        				index2++;
        				tmp+=index2;
        			}
        		}else{
        			System.out.println(tmp);
        			if(tmp>m){      				
        				tmp-=index1;
        				index1++;
        			}else if(tmp<m){
        				index2++;
        				tmp+=index2;
        			}else{
        				list=new ArrayList<Integer>();
        				list.add(tmp);
        				res.add(list);
        				index2++;
        				tmp+=index2;
        			}
        		}
        	}
        	System.out.println(res);
        }
	}

}
