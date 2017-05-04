package kitten;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Person p=new Person("Feline");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Kitten name");
	String Name=sc.next();
	Kitten k=new Kitten();
	
	System.out.println(k.name(Name));
	System.out.println(k);
    }

}
