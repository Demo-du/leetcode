package leetcode;

public class N48 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void rotate(int[][] matrix) {  
        if(matrix == null || matrix.length==0 || matrix[0].length==0)  
            return;  
        int layerNum = matrix.length/2;  
        for(int layer=0;layer<layerNum;layer++)  
        {  
            for(int i=layer;i<matrix.length-layer-1;i++)  
            {  
                int temp = matrix[layer][i];  
                matrix[layer][i] = matrix[matrix.length-1-i][layer];  
                matrix[matrix.length-1-i][layer] = matrix[matrix.length-1-layer][matrix.length-1-i];  
                matrix[matrix.length-1-layer][matrix.length-1-i] = matrix[i][matrix.length-1-layer];  
                matrix[i][matrix.length-1-layer] = temp;  
            }  
        }  
    }  
}
