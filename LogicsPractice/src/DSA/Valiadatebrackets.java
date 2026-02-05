package DSA;

import java.util.Stack;

public class Valiadatebrackets {
	public static void main(String[] args) {
		System.out.println(isValid("([))"));
	}

	private static boolean isValid(String str) {
		Stack<Character> s1 = new Stack<Character>();
		if (str.length() % 2 != 0) {
			return false;
		} else {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '(' || c == '{' || c == '[') {
					s1.push(c);
				} else if ((c == ')' && s1.pop() != '(') || (c == '}' && s1.pop() != '{')
						|| (c == ']' && s1.pop() != '[')) {
					return false;
				}
			}
		}
		return s1.isEmpty();

	}
}
