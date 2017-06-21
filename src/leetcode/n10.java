package leetcode;
/*
 * 有问题，要重新看一下
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true
 */
public class n10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("ss","c*a*ss"));

	}
	public static boolean isMatch(String s, String p) {
		if (s == null)
			return p == null;
		if (p == null)
			return s == null;
		if(p.length()==0){
			return s.length()==0;
		}
		if(s.length()==0){
			return p.length()==0;
		}
		if(p.length()==1){
			if (p.equals(s) || p.equals(".") && s.length() == 1) {
				return true;
			} else
				return false;
		}
		if(p.charAt(1)!='*'){
			if(s.length()>00&&(p.equals(s)||(p.charAt(0) == s.charAt(0)||p.charAt(0)=='.'))){
				return isMatch(s.substring(1),p.substring(1));
			}else{
				return false;
			}
		}else{
			while(s.length()>0&&(p.equals(s)||(p.charAt(0) == s.charAt(0)||p.charAt(0)=='.'))){
				if (isMatch(s, p.substring(2)))
					return true;
				s = s.substring(1);
			}
			return isMatch(s, p.substring(2));///表示匹配到0个
		}
	}

}


