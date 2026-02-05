package Number;

public class Fibonacci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int res=0;
	System.out.println(a);
	System.out.println(b);
	for (int i = 2; i < 13; i++) {
		res=a+b;
		System.out.println(res);
		a=b;b=res;
	}
}
}
