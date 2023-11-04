package menu;

public class List {
	Node head=null;
	Node tail=null;
	
    void addToHead(int x) {
		Node element = new Node();
		element.data=x;
		if(head==null) {
			element.next=null;
			head=element;
			tail=element;
			System.out.println("List is created, first element is added");
		}else {
			element.next=head;
			head=element;
			System.out.println("Added element to the beginning");
		}
	}
    
    void addToTail(int x) {
    	Node element = new Node();
    	element.data=x;
    	if(head==null) {
    		element.next=null;
    		head=element;
    		tail=element;
    		System.out.println("List was created, first element was added");
    	}else {
    		element.next=null;
    		tail.next=element;
    		tail=element;
    		System.out.println("Added element to the end");
    	}
    }
    
    void insert(int x, int index) {
    	Node element= new Node();
    	element.data=x;
    	if(head==null && index==0) {
    		element.next=null;
    		head=element;
    		tail=element;
    		System.out.println("List was created, first element was added");	
    	}else if(head!=null && index==0) {
    		element.next=head;
    		head=element;
    		System.out.println("A new element was added to the index " + index + "position");    		
    	}else {
    		int n=0;
    		Node temp=head;
    		Node temp2=head;
    		
    		while(temp.next!=null) {
    			n++;
    			temp2=temp;
    			temp=temp.next;
    		}
    		if(n == index) {
    			temp2.next=element;
    			element.next=temp;
    			System.out.println("An element was added");
    		}else {
    			temp=head;
    			temp2=head;
    			int i=0;
    			while(i!=index) {
    				temp2=temp;
    				temp=temp.next;
    				i++;
    			}
    			temp2.next=element;
				element.next=temp;
				System.out.println("A new element was added to the index " + index + "position");
    		}
    	}
    	
    }
    
    void DeleteFromBeginning()
    {
    	if(head==null) {
    		System.out.println("List is empty");
    	}else if(head.next==null) {
    		head=null;
    		tail=null;
    		System.out.println("The last remaining element in the list has been deleted");
    	}else {
    		head=head.next;
    		System.out.println("Leading element deleted");
    	}
    	
    }
    
    void DeleteFromEnd() {
    	if(head==null) {
    		System.out.println("List is empty");
    	}else if(head.next==null) {
    		head=null;
    		tail=null;
    		System.out.println("The last remaining element in the list has been deleted");
    	}else {
    		Node temp=head;
    		Node temp2=head;
    		while(temp.next!=null) {
    			temp2=temp;
    			temp=temp.next;
    		}
    		temp2.next=null;
    		tail=temp2;
    		System.out.println("Last element deleted");
    	}
    }
    
    void DeleteFromMiddle(int index) {
    	if(head==null) {
    		System.out.println("List is empty");
    	}else if(head.next==null && index==0) {
    		head=null;
    		tail=null;
    		System.out.println("The last remaining element in the list has been deleted");
    	}else if(head.next!=null && index==0){
    		head=head.next;
    		System.out.println("Leading element deleted");
    	}else {
    		int i=0;
    		Node temp=head;
    		Node temp2=head;
    		
    		while(temp!=null) {
    			i++;
    			temp2=temp;
    			temp=temp.next;
    		}
    		if(i==index) {
    			temp2.next=null;
    			tail=temp2;
    			System.out.println("The last remaining element in the list has been deleted");
    		}else {
    			temp=head;
    			temp2=head;
    			
    			int j=0;
    			while(j!=index) {
    				temp2=temp;
    				temp=temp.next;
    				j++;
    			}
    			temp2.next=temp.next;
    			System.out.println("Object in between was deleted");
    		}
    		
    	}
    }
    
    void print() {
    	if(head==null) {
    		System.out.println("List is empty");
    	}else {
    		Node temp=head;
    		System.out.print("beginning ->");
    		while(temp!=null) {
    			System.out.print(temp.data + "->");
    			temp=temp.next;
    		}
    		System.out.print("end");
    	}
    }
    

}
