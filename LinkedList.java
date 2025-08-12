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
	
	
	
	
	

	public void printList() {
		
		Node<T> current = head;
		while(current != null) {
			System.out.print(current.data);
			if(current.next!=null) System.out.print(" -> ");
			current = current.next;
		}
	}
	
	
}
