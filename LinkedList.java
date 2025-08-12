package day14practicesession.practiceproblem14;

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;
	private Node<T> tail;
	
	
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
