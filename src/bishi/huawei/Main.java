package huawei;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();
        	
        }
	}
    public static boolean duichen(char[]str,int index1,int index2) {
    	while(index1<index2) {
    		if(str[index1]==str[index2]) {
    			index1++;
    			index2--;
    		}else {
    			return false;
    		}
    	}
    	return true;
    }
}
