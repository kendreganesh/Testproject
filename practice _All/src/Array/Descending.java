package Array;

public class Descending {
	public static void main(String[] args) {
	
	int [] a=new int [] { 10,40,5,2,39,78,9,0};

	for (int i=0;i<a.length;i++) {
		int count ;
		for (int j=i+1;j<a.length;j++) {
			
			if (a[j]>a[i]) {
				count =a[i];
				a[i]=a[j];
				a[j]=count;
			}
		}
	}
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	}
}