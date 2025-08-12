package day14practicesession.practiceproblem14;

public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.append(50);
		l1.append(30);
		l1.append(70);
		l1.printList(); 
		
		System.out.println("\nUC 2: Add 30 and 56 to front of 70 ");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFront(70);
        list2.addFront(30);
        list2.addFront(56);
        list2.printList();
        
        System.out.println("\nUC 3: Appending at the end as normal appending ");
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.append(56);
        list3.append(30);
        list3.append(70);
        list3.printList();
        
        System.out.println("\n UC 4: Insert 30 between 56 and 70 ");
        list3 = new LinkedList<>();
        list3.append(56);
        list3.append(70);
        list3.insertAfter(56, 30);
        list3.printList();
        
        
        System.out.println("\n UC 5: Delete first element ");
        list3.pop();
        list3.printList();
        
        
        System.out.println("\nUC 6: Delete last element ");
        list3 = new LinkedList<>();
        list3.append(56);
        list3.append(30);
        list3.append(70);
        list3.popAtEnd();
        list3.printList();
	}
	
}
