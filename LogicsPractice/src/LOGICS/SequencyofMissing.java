package LOGICS;

import java.util.ArrayList;
import java.util.Arrays;

public class SequencyofMissing {
public static void main(String[] args) {
	int[] a= {4,10,2,5,8,12};
	Arrays.sort(a);
	ArrayList<Integer> a1= new ArrayList<Integer>();
	for(int aa:a) {
		a1.add(aa);
	}
	
	for (int i = a[0]; i < a[a.length-1]; i++) {
		if(!a1.contains(i)) {
			System.out.print(i+" ");
		}
	}
}
}
