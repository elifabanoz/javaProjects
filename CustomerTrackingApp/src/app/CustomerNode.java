package app;

public class CustomerNode {
	int id;
	String name;
	String surname;
	String number;
	String address;
	String product;
	
	CustomerNode next;
	CustomerNode prev;
	
	public CustomerNode(int id, String name, String surname, String number, String address, String product) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.number=number;
		this.address=address;
		this.product=product;
		next=null;
		prev=null;
	}
}
