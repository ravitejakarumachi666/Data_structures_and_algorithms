package stack;

import java.util.Stack;

public class balanced_parenthesis {

	public static boolean check(String str) {
		Stack<Character> s=new Stack<>(); 
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='('||c=='{'||c=='[') {
			       s.push(c);
			}
			else {
				if(s.isEmpty()) return false;
				char poped=s.pop();
				if((c==')'&&poped=='(')||(c=='}'&&poped=='{')||(c==']'&&poped=='[')) {
					continue;
				}
				else {
					return false;
				}
			}
		}
		return s.isEmpty();
	}
	
	public static void main(String[] args) {
		String str="}{([])}";
		boolean b=check(str);
		System.out.println(b);
	}

}
