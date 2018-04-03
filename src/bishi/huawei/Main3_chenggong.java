import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        while(sc.hasNext()) {
        	int n_liu=Integer.valueOf(sc.nextLine());
        	String s1=sc.nextLine();
        	String[] str1=s1.split(" ");
        	String s2=sc.nextLine();
        	String[] str2=s2.split(" ");
        	int []weight=new int[str2.length];
        	int []value=new int[str2.length];
        	//System.out.println(String.valueOf(weight[0]));
        	//YY[] yy=new YY[str2.length];
        	for(int i=0;i<str2.length;i++) {
        		weight[i]=Integer.valueOf(str1[i]);
        		value[i]=Integer.valueOf(str2[i]);
        	}
        	//System.out.println(String.valueOf(value[0]));
        	///===
        	int lenrow=weight.length;
        	int lencol=n_liu;
        	/*for(int i=0;i<weight.length;i++) {
        		lencol+=weight[i];
        	}*/
        	int [][]F=new int[lenrow][lencol+1];
        	String [][]res=new String[lenrow][lencol+1];
        	for(int i=0;i<lenrow;i++) {
        		for(int j=0;j<lencol+1;j++) {
        			res[i][j]="";
        		}
        	}
        	for(int i=1;i<weight.length;i++) {
        		for(int j=1;j<=lencol;j++) {
        			if(j<weight[i]) {
        				F[i][j]=F[i-1][j];
        				res[i][j]=res[i-1][j];
        			}else {
        				if(F[i-1][j]>F[i-1][j-weight[i]]+value[i]) {
        					F[i][j]=F[i-1][j];
        					res[i][j]=res[i-1][j];
        				}else {
        					F[i][j]=F[i-1][j-weight[i]]+value[i];
        					res[i][j]=res[i-1][j-weight[i]]+" "+i+"";
        				}
        			}
        		}
        	}
        	String jieguo=res[lenrow-1][n_liu].trim();
        	String []tmp=jieguo.split(" ");
        	for(int i=0;i<tmp.length;i++) {
        		int tt=Integer.valueOf(tmp[i]);
        		int tt2=panduan(value,tt);
        		tmp[i]=""+(tt2+1);
        	}
        	String zuizhong="";
        	for(int i=0;i<tmp.length;i++) {
        		zuizhong+=tmp[i]+" ";
        	}
        	System.out.println(zuizhong.trim());
        }
	}
    public static int  panduan(int []value,int i) {
    	while(i-1>=0&&value[i]==value[i-1]) {
    		i=i-1;
    	}
    	return i;
    }
}
