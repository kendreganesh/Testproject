package Array;

public class multi_dimensional {
	public static void main(String[] args) {
int ar[][]= { {10,20,30,40} ,{ 50,60,70}};
int a=ar.length-1;
for (int i=0;i<ar.length;i++) {
	for (int j=0;j<ar[i].length;j++) {
		System.out.println(ar[i][j]+",");
	}
	System.out.println();
}

}
}