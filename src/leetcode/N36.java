package leetcode;

public class N36 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N36 n36=new N36();
        char []x={'1','2','3','4'};
        System.out.println(n36.check_raw(x));
	}
    public boolean isValidSudoku(char[][] board) {
    	for(int i=0;i<9;i++){//横着
    		if(!check_raw(board[i])){
    			return false;
    		}
    	}
    	for(int j=0;j<9;j++){  
            boolean[] map = new boolean[9];  
            for(int i=0;i<9;i++)  
            {  
                if(board[i][j] != '.')  
                {  
                    if(map[(int)(board[i][j]-'1')])  
                    {  
                        return false;  
                    }  
                    map[(int)(board[i][j]-'1')] = true;  
                }  
            }  
        }  
    	for(int block=0;block<9;block++){  
            boolean[] map = new boolean[9];  
            for(int i=block/3*3;i<block/3*3+3;i++)  
            {  
                for(int j=block%3*3;j<block%3*3+3;j++)  
                {  
                    if(board[i][j] != '.')  
                    {  
                       if(map[(int)(board[i][j]-'1')])  
                       {  
                          return false;  
                       }  
                       map[(int)(board[i][j]-'1')] = true;      
                    }  
                }  
            }  
        } 
        return true;
    }
    public boolean check_raw(char[] x){
    	int []hash=new int[10];
    	for(int i=0;i<x.length;i++){
    		if(x[i]!='.'){
    			if(hash[x[i]-'0']>0){
    				return false;
    			}
    			hash[x[i]-'0']++;
    		}
    	}
    	return true;
    }
}
