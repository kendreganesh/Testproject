package Array;

public class Ascending_order {

public static void main (String []args) {
int a []= new int [] {80,70,40,30,40,20};
 for (int i=0;i<a.length;i++) {
	 int count ;
 
 for (int j=i+1;j<a.length;j++) {
	 if (a[i]>a[j]) {
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
