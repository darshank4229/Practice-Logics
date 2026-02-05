package LOGICS;

public class ReverseStringWithWhileLoop {
	public static void main(String[] args) {
		String str = "java";
		char[] c = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		System.out.println(c);
	}

}
