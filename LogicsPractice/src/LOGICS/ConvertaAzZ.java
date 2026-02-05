package LOGICS;

public class ConvertaAzZ {
public static void main(String[] args) {
	String a="KiChaA";
//	a=a.toLowerCase();
//	String res="";
//	String [] a1= a.split(" ");
//	for (int i = 0; i < a1.length; i++) {
//		char f= (char)(a1[i].charAt(0)-32);
//		res= res+f+a1[i].substring(1)+" ";
//	}
//	System.out.println(res);
	String res="";
	for (int i = 0; i <a.length(); i++) {
		char ch= a.charAt(i);
		if(ch>='A'&& ch<='Z') {
			res=res+((char)(ch+32));
		}
		else {
			res=res+((char)(ch-32));
		}
	}
	System.out.println(res);
}
}
