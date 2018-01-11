package bishi;

public class P37 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []num={2,1,5,6,2,3};
        solve(num);
	}
    public static void solve(int []num){
    	int index1=0;
    	int index2=num.length-1;
    	int [][]min=new int[num.length+1][num.length+1];
    	for(int i=0;i<num.length;i++){
    		min[i][i]=num[i];
    	}
    	for(int i=0;i<num.length;i++){
    		for(int j=i+1;j<num.length;j++){
    			min[i][j]=Math.min(min[i][j-1],num[j]);
    		}
    	}
    	int max=0;
    	int sq=0;
    	while(index1<=index2){
    		sq=(index2-index1+1)*min[index1][index2];
    		
    		if(sq>max){
    			max=sq;
    		}
    		if(num[index1]<num[index2]){
    			index1++;
    		}else{
    			index2--;
    		}
    	}
    	System.out.println(max);
    }
}
