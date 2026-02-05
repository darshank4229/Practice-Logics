package Number;

public class Perfectnumber {
public static void main(String[] args) {
	int no=6;
	int sum=0;
	for (int i = 1; i <=no/2; i++) {
		if(no%i==0) {
			sum=sum+i;
		}
	}
	if(sum==no) {
		System.out.println("perfect");
	}
	else {
		System.out.println(" not perfect");
	}
}
}
