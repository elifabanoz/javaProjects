package menu;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		List list = new List();
		Scanner scan = new Scanner(System.in);
		int number, index;
		
		int choice=1;
		
		while(choice!=0) {
		System.out.println();
		System.out.println("1: prepend ");
		System.out.println("2: add to end ");
		System.out.println("3: insert ");
		System.out.println("4: delete from the beginning ");
		System.out.println("5: delete from end ");
		System.out.println("6: delete from the middle ");
		System.out.println("0: exit");
		choice=scan.nextInt();
		
		if(choice==1) {
			System.out.println("Number: ");
			number=scan.nextInt();
			list.addToHead(number);
		}else if(choice==2) {
			System.out.println("Number: ");
			number=scan.nextInt();
			list.addToTail(number);
		}else if(choice==3) {
			System.out.println("Number: ");
			number=scan.nextInt();
			System.out.println("Index: ");
			index=scan.nextInt();
			list.insert(number, index);
		}
		else if(choice==4) {
			list.DeleteFromBeginning();
		}
		else if(choice==5) {
			list.DeleteFromEnd();
		}
		else if(choice==6) {
			System.out.println("Index: ");
			index=scan.nextInt();
			list.DeleteFromMiddle(index);
		}else if(choice==0) {
			System.out.println("Program terminated");
		}else {
			System.out.println("Wrong choice");
		}
		
		list.print();
		
		
		
	}
	}
}
