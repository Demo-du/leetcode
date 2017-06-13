package leetcode;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

Subscribe to see which companies asked this question.

 */
public class n6 {
    public static void main(String[] args){
    	System.out.println(convert("abdcsgu",3));
    }
    public static  String convert(String s, int numRows) {
    	char aa[]=s.toCharArray();
    	int gap=numRows-2;
    	String [] rel=new String[numRows];
    	for(int i=0;i<numRows;i++){
    		rel[i]="";
    	}
    	int x=0;
        while(x<s.length()){
        	for(int i=0;x<s.length()&&i<numRows;i++){
        		rel[i]+=aa[x];
        		x++;
        	}
        	for(int i=gap;x<s.length()&&i>0;i--){
        		rel[i]+=aa[x];
        		x++;
        	}	
        }
        String sol="";
        for(int i=0;i<numRows;i++){
        	sol+=rel[i];
        }
        return sol;
    }
}
