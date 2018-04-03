package huawei;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();
        	char []arr=s.toCharArray();
        	int x=getlen(arr);
        	System.out.println(x);
        }
	}
    public static int mid(char[]arr,int index) {
    	int length=1;
    	int j=1;
    	while((arr[index-j]==arr[index+j])&&(index-j)>=0&&arr.length>(index+j)) {
    		length+=2;
    		j++;
    	}
    	return length;
    }
    public static int max(char[]arr,int index) {
    	int length=0;
    	int j=0;
    	while((arr[index-j]==arr[index+j+1])&&(index-1)>=0&&arr.length>(length+j+1)) {
    		length+=1;
    		j++;
    	}
    	return length;
    }		
    public static int getlen(char[]arr) {
    	if(arr.length==0) {
    		return 0;
    	}
    	int maxlen=0;
    	for(int i=0;i<arr.length;i++) {
    		int tmpmax=-1;
    		int len1=mid(arr,i);
    		int len2=max(arr,i);
    		tmpmax=(len1>len2)?len1:len2;
    		if(tmpmax>maxlen) {
    			maxlen=tmpmax;
    		}
    	}
    	return maxlen;
    }
}
