package abstractFactory;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the company name");
		String name=sc.next();
		FactoryGetter fg=new FactoryGetter();
		Factory f=fg.getFactory(name);
		f.producecomponents();
		
		
	}
	
   
	
}
