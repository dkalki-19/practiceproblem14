package day14practicesession.practiceproblem14;

public class Node<T extends Comparable<T>> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
		this.next = null;	
	}
}
