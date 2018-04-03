package huawei;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.nextLine();
        	if(s.charAt(0)=='F'&&s.charAt(1)=='E'&&s.charAt(2)=='8') {
        		System.out.println("LinkLocal");
        	}else if(s.charAt(0)=='F'&&s.charAt(1)=='E'&&s.charAt(2)=='C'){
        		System.out.println("SiteLocal");
        	}else if(s.charAt(0)=='F'&&s.charAt(1)=='F'){
        		System.out.println("Multicast");
        	}else {
        		System.out.println("Error");
        	}
        	
        }
	}

}
