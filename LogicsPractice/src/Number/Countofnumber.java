package Number;

public class Countofnumber {
public static void main(String[] args) {
	int no=1234;
	int count=0;
	while(no!=0) {
		count++;
		no=no/10;
	}
	System.out.println(count);
}
}
