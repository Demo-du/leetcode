package bishi;

import java.util.Scanner;

public class P78 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	String s=sc.nextLine();
        	char[]str=s.toCharArray();
        	int index1=0;
        	int index2=s.length()-1;
        	turn(str,index1,index2);
        	for(int i=0;i<s.length();i++){
        		if(str[i]==' '){
        			index2=i-1;
        			turn(str,index1,index2);
        			index1=i+1;
        			//index2=i+1;
        		}
        		if(i==s.length()-1){
        			index2=i;
        			turn(str,index1,index2);
        		}
        	}
        	System.out.println(String.valueOf(str));
        }
	}
    public static void swap(char[]str,int index1,int index2){
    	char tmp=str[index1];
    	str[index1]=str[index2];
    	str[index2]=tmp;
    }
    public static void turn(char[]str,int index1,int index2){
    	while(index1<index2){
    		swap(str,index1,index2);
    		index1++;
    		index2--;
    	}
    	
    }
}
