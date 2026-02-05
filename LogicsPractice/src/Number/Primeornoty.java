package Number;

public class Primeornoty {
	public static void main(String[] args) {
		int no = 7;	
		for (int j = no + 1; j < 100; j++) {
			no = j;
			boolean f = true;
			if (no <= 1) {
				f = false;
				System.out.println("not prime ");
			} else {
				for (int i = 2; i <= no / 2; i++) {
					if (no % i == 0) {
						f = false;
						break;
					}
				}
			}

			if (f) {
				System.out.println("prime " + no);
				
			}
		}
	}
}
