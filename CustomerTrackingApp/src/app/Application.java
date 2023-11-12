package app;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		List list= new List();
		
		int choice=-1;
		while(choice!=0) {
			System.out.println("1- Add");
			System.out.println("2-Remove");
			System.out.println("3-Update");
			System.out.println("4-Search");
			System.out.println("5-Print");
			System.out.println("0-Exit");
			System.out.println("Your choice:");
			choice=scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				list.add();
				break;
			case 2:
				list.remove();
				break;
			case 3:
				list.update();
				break;
			case 4:
				list.SearchCustomer();
				break;
			case 5:
				list.PrintCustomer();
				break;
			case 0:
				System.out.println("You have logged out of the system");
				break;
			default:
				System.out.println("Wrong choice [0-5]");
				break;
	
			}
			
		}

	}

}
