package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N30 {

	/**
	 * 超时是因为每次循环体里都有一次初始化hashmap，
	 * 其实考虑到hash的插入搜索时间都为1，每次循环新建一个hash就可以直接去掉n*k（k为hashkey的数目）的复杂度，这样就不会超时了。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        N30 n30=new N30();
        String s="wordgoodgoodgoodbestword";
        String[] words={"word","good","best","good"};
        System.out.println(n30.findSubstring(s, words));
	}
    public List<Integer> findSubstring(String s, String[] words) {
    	List<Integer> ans = new ArrayList<Integer>();  
    	if(words.length*words[0].length()>s.length()){
    		return ans;
    	}
    	int len=words[0].length();
    	Map<String,Integer> map=new HashMap<String,Integer>();
    	for(int i=0;i<words.length;i++){
    		if(map.containsKey(words[i])){
    			map.put(words[i],map.get(words[i])+1);
    		}else{
    			map.put(words[i],1);
    		}
    	}
    	for(int i=0;i<=s.length()-len*words.length;i++){
    		Map<String,Integer> seen=new HashMap<String,Integer>();
    		int cnt=0;
    		String str=s.substring(i, i+len);
    		int start=i;
    		while(map.containsKey(str)){
    			//cnt++;
    			if(seen.containsKey(str)){
    				seen.put(str, seen.get(str)+1);
    			}else{
    				seen.put(str, 1);
    			}
                if (seen.get(str) > map.get(str)) {
                    break;
                }
                cnt++;
    			start+=len;
    			if(start+len>s.length()){
    				break;
    			}
    			str=s.substring(start,start+len);
    		}
    		if(cnt==words.length){
    			ans.add(i);
    		}
    	}
        return ans;
    }
}
