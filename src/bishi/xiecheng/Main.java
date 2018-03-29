package xiecheng;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()) {
        	int n=sc.nextInt();
        	int []nums=new int[n];
        	for(int i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        	}
        	int index1=0;
        	int index2=n-1;
        	while(nums[index2]==0) {
        		index2--;
        	}
        	while(index1<index2) {
        		while(nums[index1]==0&&index1<index2) {
        			int tmp=nums[index1];
        			nums[index1]=nums[index2];
        			nums[index2]=tmp;
        			while(nums[index2]==0&&index1<index2) {
                		index2--;
                	}
        		}
        		index1++;
        	}
        	for(int i=0;i<n;i++) {
        		System.out.println(nums[i]);
        	}
        }
	}

}
