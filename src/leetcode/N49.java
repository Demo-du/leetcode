package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N49 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		N49 n49=new N49();
		System.out.println(n49.groupAnagrams(strs));

	}
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = new ArrayList<>();  
        Map<String, List<String>> map = new HashMap<>();  
    	for(String s:strs){
    		char[] ch=s.toCharArray();
    		Arrays.sort(ch);
    		String key=String.valueOf(ch);
    		if(!map.containsKey(key)){
    			map.put(key, new ArrayList<String>());
    		}
    		map.get(key).add(s);
    	}
    	for(String key:map.keySet()){
    		List<String> tmp=map.get(key);
    		result.add(tmp);
    	}
        return result;
    }
}
