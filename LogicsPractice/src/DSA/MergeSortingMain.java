package DSA;

public class MergeSortingMain {
public static void main(String[] args) {
	int[]a= {3,2,4,1,5};
	mergSort(a,0,a.length-1);
}

private static void mergSort(int[] a, int li, int hi) {
	if(li<hi) {
		int mid=(li+hi)/2;
		mergSort(a, li, mid);
		mergSort(a, mid+1, hi);
		merge(a,li,mid,hi);
	}
}

private static void merge(int[] a, int li, int mid, int hi) {
	int s1=mid-li+1;
	int s2=hi-mid;
	int[] LSA=new int[s1];
	int[] RSA=new int[s2];
	for (int i = 0; i < s1; i++) {
		LSA[i]=a[li+i];
	}
	for (int j = 0; j < s2; j++) {
		RSA[j]=a[mid+1+j];
	}
	
	int i=0,j=0,k=li;
	while(i<s1&&j<s2) {
		if(LSA[i]<RSA[j]) {
			a[k++]=LSA[i++];
		}else {
			a[k++]=RSA[j++];
		}
	}
	while(i<s1) {
		a[k++]=LSA[i++];
	}
	while(j<s2) {
		a[k++]=RSA[j++];
	}
	
}
}
