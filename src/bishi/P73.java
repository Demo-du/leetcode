package bishi;

import java.util.Scanner;

public class P73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String str=sc.next();
        	String tmp="";
        	String res="";
        	int len=0;
        	int len_tmp=0;
        	for(int i=0;i<str.length();i++){
        		if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
        			len_tmp++;
                    tmp+=str.charAt(i);
                    if(len_tmp>len){
        				len=len_tmp;
        				res=tmp;
        			}
        		}else{
        			
        			len_tmp=0;
        			tmp="";
        		}
        	}
        	System.out.println(res);
        }
	}

}
