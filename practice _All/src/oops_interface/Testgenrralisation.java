package oops_interface;

public class Testgenrralisation {
	public static void main(String[] args) {
		System.out.println("***********Features of jio*************");
		Jio j = new  Jio ();
		j.audioCalling();
		j.Internet();
		j.SMS();
		j.newfeatureA();
		
		
		System.out.println("*************Feture of Idea ******************");
		Idea i = new Idea ();
		i.audioCalling();
		i.Internet();
		i.SMS();
		i.newfeatureB();
	}

}
