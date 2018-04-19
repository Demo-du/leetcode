package aiqiyi;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int []num=new int[3];
        	for(int i=0;i<3;i++) {
        		num[i]=sc.nextInt();
        	}
        	int cnt=0;
        	while(!(num[0]==num[1]&&num[1]==num[2])) {
        		int tmp_max=Integer.MIN_VALUE;
        		int index=0;//zuida
        		int index2=0;//fei
        		for(int i=0;i<3;i++) {
        			if(num[i]>=tmp_max) {
        				index=i;
        				tmp_max=num[i];
        			}
        		}
        		int tmp_num=0;
        		for(int i=0;i<3;i++) {
        			if(num[i]==tmp_max) {
        				tmp_num++;
        			}else {
        				index2=i;
        			}
        		}
        		if(tmp_num==1) {//只有1个最大
        			for(int i=0;i<3;i++) {
        				if(i!=index) {
        					num[i]++;
        				}
        			}
        			cnt++;///cnt++
        		}
        		if(tmp_num==2) {
        			num[index2]++;
        			num[index2]++;
        			cnt++;
        		}
        		if(tmp_num==3) {
        			break;
        		}
        	}
        	System.out.println(cnt);
        }
	}

}
