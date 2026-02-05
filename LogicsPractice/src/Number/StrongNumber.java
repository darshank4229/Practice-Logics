package Number;

public class StrongNumber {
	public static int fact(int no) {
		int sum=1;
		for (int i = 1; i <=no; i++) {
			sum=sum*i;
		}
		return sum;
	}
public static void main(String[] args) {
	int no=145;
	int copy=no;
	int sum=0;
	while(no!=0) {
		int rem=no%10;
		sum=sum+fact(rem);
		no=no/10;
	}
	if(copy==sum) {
		System.out.println("strong");
	}
	else{
		System.out.println("week");
	}
}
}
