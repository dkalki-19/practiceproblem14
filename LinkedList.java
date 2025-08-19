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

	
	//uc7 => Find the element with the given key
	
	public boolean search(T key) {
		
		Node current = head;
		while(current!=null) {
			if(current.data.equals(key)) return true;
			current = current.next;
		}
		return false;
		
	}
	
	 public void delete(T key) {
        if (head == null) return;

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && !temp.next.data.equals(key)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // UC9 =>  Size of list
    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

	
	public void printList() {
		
		Node<T> current = head;
		while(current != null) {
			System.out.print(current.data);
			if(current.next!=null) System.out.print(" -> ");
			current = current.next;
		}
	}
	
	
	// UC10 - Add in sorted order
    public void addSorted(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null && temp.next.data.compareTo(data) < 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }


	
}
