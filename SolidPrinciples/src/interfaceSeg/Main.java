package interfaceSeg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome to our site.would you like to order or repair");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		String productdetail=null;
		switch(choice) {
		case "order":
			System.out.println("please provide your phone model name");
			productdetail=sc.next();
			ProcessOrderClass po=new ProcessOrderClass();
		    po.printorder(productdetail);
		    break;
	    case "repair":
				System.out.println("accessory or phone to repair");
				String producttype=sc.next();
				if(producttype.equalsIgnoreCase("PHONE")) {
					ProcessPhoneRepairClass pp=new ProcessPhoneRepairClass();
					System.out.println("please provide your phone model name");
					productdetail=sc.next();
			        pp.printphone(productdetail);
				}
				else {
					ProcessAccessoryRepairClass pa=new ProcessAccessoryRepairClass();
					System.out.println("please provide your phone model name");
					productdetail=sc.next();
			        pa.printaccessory(productdetail);
				}
				break;
		default:System.out.println("enter a valid choice");
		
		}
		
	}
	
}
