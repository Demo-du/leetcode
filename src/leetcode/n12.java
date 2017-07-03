package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
I = 1;
V = 5;
X = 10;
L = 50;
C = 100;
D = 500;
M = 1000;
 */
public class n12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public String intToRoman(int num) {
    	Map<Integer,String> dic=new HashMap<Integer,String>();
    /*	List<Integer> shu=new LinkedList<Integer>();
    	shu.add(1);
    	shu.add(5);
    	shu.add(10);
    	shu.add(50);
    	shu.add(500);*/
    	dic.put(1, "I");
    	dic.put(5, "V");
    	dic.put(10, "X");
    	dic.put(50, "L");
    	dic.put(100, "C");
    	dic.put(500, "D");
    	dic.put(1000, "M");
    	String ans="";
    	int temp=0;
    	temp=num/1000;
    	
        return null;
    }
}
