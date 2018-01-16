package bishi;

public class P41 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []a={1,3,4,5,8,9};
        int []b={2,6,7,10,12,13,15};
        P41 p41=new P41();
        p41.solve(a, b);
	}
    public void solve(int []a,int []b){
    	int len=a.length+b.length;
    	if(a.length==0||a==null){
    		System.out.println(String.valueOf(b));
    		return;
    	}
    	if(b.length==0||b==null){
    		System.out.println(String.valueOf(a));
    		return;
    	}
    	int []res=new int[len];
    	int index1=0;
    	int index2=0;
    	int index3=0;
    	while(index1<a.length&&index2<b.length){
    		if(a[index1]<b[index2]){
    			res[index3]=a[index1];
    			index1++;
    			index3++;
    		}else{
    			res[index3]=b[index2];
    			index2++;
    			index3++;
    		}
    		
    	}
    	if(index2<b.length){
    		for(;index2<b.length;index2++,index3++){
    			res[index3]=b[index2];
    		}
    	}else{
    		for(;index1<a.length;index1++,index3++){
    			res[index3]=b[index1];
    		}
    	}
    	for(int i=0;i<len;i++){
    		System.out.print(res[i]);
    	}
    }
}
