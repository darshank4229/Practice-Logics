package DSA;

public class ValidIP {
public static void main(String[] args) {
	System.out.println(valid("000.11.22.33"));
}

private static boolean valid(String no) {
	String []ip= no.split("\\.");
	if(ip.length!=4) {
		return false;
	}
	for(String n:ip) {
		int num=Integer.parseInt(n);
		 if(num<0||num>255) {
			 return false;
		 }
		 if(n.length()==0) {
			 return false;
		 }
		 if(n.length()>1&&n.charAt(0)=='0') {
			 return false;
		 }
	}
	return true;
	
}
}
