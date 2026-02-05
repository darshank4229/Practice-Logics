package DSA;

public class Factorial {
	public static int fact(int no) {
		if(no==0) {
			return 0;
			
		}
		else if(no==1) {
			return 1;
			
		}
		else {
			return no*fact(no-1);
					
		}
	}
public static void main(String[] args) {
	System.out.println(fact(5));
}
}
