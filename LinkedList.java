package day14practicesession.practiceproblem14;

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;
	int size = 0;
	
	
	//use case 1 -> adding data at end
	public void append(T data) {
		
		Node<T> newNode = new Node(data);
		
		if(head==null) {
			head = tail = newNode;
		}
		else {
			tail.next = newNode;
		    tail = newNode;
		}
		size++;
	}
	
	
	// use case 2 -> adding data at front
	
	public void addFront(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head==null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	
	//use case 4 - > inserting element after the specified element
	
	public void insertAfter(T key,T data) {
		
		Node current  = head;
		while(current!=null && !current.data.equals(key) ) {
			current = current.next;
		}
		if(current!=null) {
			Node<T> newNode = new Node<>(data);
			newNode.next = current.next;
			current.next = newNode;
			if(current==tail) tail = newNode;
			size++;
		}
	}
	
	
	// uc5 => Deleting at front
	
	public void pop() {
		if(head!=null) {
			head.next = null;
			size--;
		}
	}
	
	// uc6 => Deleting at end
	
	public void popAtEnd() {
		if(head==null) {
			return ;
		}
		if(head==tail){
			head = tail = null;
		}
		else {
			Node current = head;
			while(current.next!=tail) {
				current = current.next;
			}
			current.next = null;
			tail = current;
		}
		size--;
		
	}

	
	public void printList() {
		
		Node<T> current = head;
		while(current != null) {
			System.out.print(current.data);
			if(current.next!=null) System.out.print(" -> ");
			current = current.next;
		}
	}
	
	
}
