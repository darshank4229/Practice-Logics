package Number;

public class AmstrongNumber {
	
public static void main(String[] args) {
	int no=153;
	int a=no;
	int b=no;
	int sum=0;
	int count=0;
	while(no!=0) {
		count++;
		no=no/10;
	}
	while(a!=0) {
		int rem=a%10;
		sum=(int) (sum+Math.pow(rem, count));
		a=a/10;
	}
	if(b==sum) {
		System.out.println("amstrong");
	}
	else{
		System.out.println("not amstrong");
	}
}
}
