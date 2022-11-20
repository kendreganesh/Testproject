package Array;

public class swapping_of_index {
	
	public static void main(String[] args) {
		
	
	
	int a [] = {90,78,9,56,45};
for (int i =0;i<a.length;i++) {
	System.out.print(a[i]+",");
}

for (int i=0;i<(a.length/2);i++) {
	int z;
	z=a[i];
	a[i]=a[(a.length-1)-i];
	a[(a.length-1)-i] =z;
}
System.out.println();
for (int i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
	System.out.print(a[1]);
}
}
}
	
