package toutiao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int []nums=new int[n];
        	for(int i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        	}
        	Arrays.sort(nums);
        	HashSet<Integer> h=new HashSet<Integer>();
        	for(int i=0;i<n;i++) {
        		h.add(nums[i]);
        	}
        	nums=new int[h.size()];
        	n=h.size();
        	int tt=0;
        	Iterator it=(Iterator) h.iterator();
        	//
        	int index1=0;
        	int index2=0;
        	int cnt=0;
        	while(index2<n) {
        		if(nums[index2]-nums[index1]>k) {
        			index1++;
        		}else if(nums[index2]-nums[index1]<k) {
        			index2++;
        		}else {
        			cnt++;
        			index1++;
            		index2++;
        		}
        		
        		/*while(index1<n&&index2<n&&nums[index1+1]==nums[index1]) {
        			index1++;
        		}
        		while(index1<n&&index2<n&&nums[index1+1]==nums[index1]) {
        			index1++;
        		}*/
        	}
        	System.out.println(cnt);
        }
	}

}
/*
 * *import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int k=sc.nextInt();
        	int []nums=new int[n];
        	for(int i=0;i<n;i++) {
        		nums[i]=sc.nextInt();
        	}
        	Arrays.sort(nums);
        	int index1=0;
        	int index2=0;
        	int cnt=0;
        	while(index2<n) {
        		if(nums[index2]-nums[index1]>k) {
        			index1++;
        		}else if(nums[index2]-nums[index1]<k) {
        			index2++;
        		}else {
        			cnt++;
        			index1++;
            		index2++;
        		}
        		
        		
        	}
        	System.out.println(cnt);
        }
	}

}

 */
