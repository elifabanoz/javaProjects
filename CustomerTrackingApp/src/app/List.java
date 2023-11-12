package app;
import java.util.Scanner;

public class List {
	Scanner scan= new Scanner(System.in);
	
	CustomerNode head=null;
	CustomerNode tail=null;
	
	int id;
	String name;
	String surname;
	String number;
	String address;
	String product;
	
	void add() {
		System.out.println("Please enter customer's information:");
		System.out.println();
		System.out.println("id:");
		id=scan.nextInt();
		scan.nextLine();
		System.out.println("name:");
		name=scan.nextLine();
		System.out.println("surname:");
		surname=scan.nextLine();
		System.out.println("number:");
		number=scan.nextLine();
		System.out.println("address:");
		address=scan.nextLine();
		System.out.println("product:");
		product=scan.nextLine();
		
		CustomerNode customer= new CustomerNode(id, name, surname, number, address, product);
		if(head==null) {
			head=customer;
			tail=customer;
			System.out.println("List was created, first customer was added in the list");
		}else {
			customer.next=head;
			head.prev=customer;
			head=customer;
			System.out.println("Customer with " +id+ " was registered ");
		}
	}
	
void remove() {
		boolean result=false;
		if(head==null) {
			System.out.println("List is empty");
		}else {
			System.out.println("Please enter customer's id to remove:");
			System.out.println();
			System.out.println("id:");
			id=scan.nextInt();
			scan.nextLine();	
			if(head.next==null && head.id==id) {
				head=null;
				tail=null;
				System.out.println("Customer with "+ id+ " was deleted");
				result=true;
			}else if(head.next!=null && head.id==id) {
				head=head.next;
				head.prev=null;
				System.out.println("Customer with " + id+ " was deleted");
			}else if(tail.id==id) {
			tail=tail.prev;
			tail.next=null;
			System.out.println("Customer with " + id+ " was deleted");
			result=true;
		}else {
			CustomerNode temp= head;
			while(temp!=null) {
				if(temp.id==id) {
					temp.next.prev=temp.prev;
					temp.prev.next=temp.next;
					result=true;
					break;
				}
				temp=temp.next;
				
			}
			
		}
		
		if(!result) {
			System.out.println("Customer with " +id+ " does not exist in the list");
		}
		
		}
	}
void update() {
	boolean result=false;
	if(head==null) {
		System.out.println("List is empty");
	}else {
		System.out.println("Please enter customer's id to update:");
		System.out.println();
		System.out.println("id:");
		id=scan.nextInt();
		scan.nextLine();	
		
		CustomerNode temp= head;
		while(temp!=null) {
			if(temp.id==id) {
				
			System.out.println("Customer's with " +id+ " information:");
			System.out.println("Name: " +temp.name);
			System.out.println("Surname: " +temp.surname);
			System.out.println("Number: " +temp.number);
			System.out.println("Address: " +temp.address);
			System.out.println("Product: " +temp.product);
			
			System.out.println("Please update product's information:");
			temp.product=scan.nextLine();
			System.out.println("Product's information was updated");
		
				result=true;
				break;
			}
			temp=temp.next;
		}
	
	if(!result) {
		System.out.println("Customer with " +id+ " does not exist in the list");
	}

	
}
}

void SearchCustomer() {
	boolean result=false;
	if(head==null) {
		System.out.println("List is empty");
	}else {
		System.out.println("Please enter customer's id to search:");
		System.out.println();
		System.out.println("id:");
		id=scan.nextInt();
		scan.nextLine();	
		
		CustomerNode temp= head;
		while(temp!=null) {
			if(temp.id==id) {
				
			System.out.println("Customer's with " +id+ " information:");
			System.out.println("Name: " +temp.name);
			System.out.println("Surname: " +temp.surname);
			System.out.println("Number: " +temp.number);
			System.out.println("Address: " +temp.address);
			System.out.println("Product: " +temp.product);
		
				result=true;
				break;
			}
			temp=temp.next;
		}
	
	if(!result) {
		System.out.println("Customer with " +id+ " does not exist in the list");
	}

	
}
}
void PrintCustomer() {
	boolean result=false;
	if(head==null) {
		System.out.println("List is empty");
	}else {
		System.out.println("Id\tName\tSurname\tNumber\tAddress\tProduct Name\n");
		
		CustomerNode temp= head;
		while(temp!=null) {
				System.out.println(temp.id + "\t" + temp.name + "\t" + temp.surname + "\t" + temp.number + "\t" + temp.address + "\t" + temp.product);	
	
			temp=temp.next;
		}
	
	

	
}
}





}
