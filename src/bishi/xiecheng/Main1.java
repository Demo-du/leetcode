package xiecheng;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()) {
        	int n=sc.nextInt();
        	int []nums=new int[n];
        	for(int i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        	}
        	int []nums2=new int[n];
        	int index1=0;
        	for(int i=0;i<n;i++) {
        		if(nums[i]!=0) {
        			nums2[index1]=nums[i];
        			index1++;
        		}
        	}
        	for(int i=0;i<n;i++) {
        		System.out.println(nums2[i]);
        	}
        }
	}

}
