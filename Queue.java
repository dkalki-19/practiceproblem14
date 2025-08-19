package day14practicesession.practiceproblem14;

public class Queue<T extends Comparable<T>> {
	
	LinkedList<T> list = new LinkedList<>();

    public void enqueue(T data) { list.append(data); }   // Add at end
    public T dequeue() { return list.pop(); }         // Remove from front
    public boolean isEmpty() { return list.head == null; }
    public void printQueue() { list.printList(); }

}
