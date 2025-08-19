package day14practicesession.practiceproblem14;

public class Stack<T extends Comparable<T>> {
	
	LinkedList<T> list = new LinkedList<>();

    public void push(T data) { list.addFront(data); }
    public T pop() { return list.pop(); }
    public T peek() { return (list.head != null) ? list.head.data : null; }
    public boolean isEmpty() { return list.head == null; }
    public void printStack() { list.printList(); }

}
