package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class P58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	//System.out.println("1sss");
        	int []zhuozi=new int [n];
        	Keren []keren=new Keren [m];
        	for(int i=0;i<n;i++){
        		zhuozi[i]=sc.nextInt();
        	}
        	//System.out.println("2sss");
        	for(int i=0;i<m;i++){
        		keren[i]=new Keren(sc.nextInt(),sc.nextInt());
        	}
        	boolean []chosekeren=new boolean [m];
        	boolean []chosezhuozi=new boolean [n];
        	Arrays.sort(zhuozi);
        	for(int i=0;i<m-1;i++){
        		for(int j=i+1;j<m;j++){
        			if(keren[i].xiaofei<keren[j].xiaofei){
        				Keren tmp=keren[i];
        				keren[i]=keren[j];
        				keren[j]=tmp;
        			}
        		}
        	}
        	int res=0;
        	for(int i=0;i<m;i++){
        		for(int j=0;j<n;j++){
        			if(keren[i].num<=zhuozi[j]&&chosezhuozi[j]==false){//可以被容纳
        				chosezhuozi[j]=true;
        				res+=keren[i].xiaofei;
        				break;
        			}
        		}
        	}
        	System.out.println(res);
        	//System.out.println("sss");
        }
	}

}
class Keren{
	int num;
	int xiaofei;
	public Keren(){}
	public Keren(int num,int xiaofei){
		this.num=num;
		this.xiaofei=xiaofei;
		
	}
}