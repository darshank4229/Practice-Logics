package LOGICS;

public class CheckStringPalindrome {
public static void main(String[] args) {
	String str= "java";
	String res="";
	for (int i = str.length()-1; i >=0; i--) {
		res=res+str.charAt(i);	
	}
	if(str.equals(res)) {
		System.out.println("palindrome");	
	}
	else {
		System.out.println("not palindrome ");
	}

}
}
