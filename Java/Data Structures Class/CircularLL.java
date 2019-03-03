//Singly Linked Circular Linked List
/*
It may have been easier for deletion if I used a doubly linked circular linked list

I looked at nested classes when I noticed your comment stating that classes cannot be nested. 
It is true that there is often a warning when classes are nested and it may not even compile 
in when using the Java plug-in with Visual Studio Code, however, it compiles on most IDEs otherwise.
 As this was a feature of Java 8, there is documentation about nested classes and I also tested 
 this code on Eclipse Oxygen with Java 1.8, so it should work.
*/

// Program: Circular LL
// Written by: T Shee
// Program Description: Singly Circular Linked List
// File description: Holds nested Node class and CircularLL
// Other files in this project: N/A
// Challenges: Get Middle (had to look at my previous code)
// Time Spent: 1 hour
// Does your program's output match the required output in the specification? Yes  
// If not, how does it differ? May have been meant to be a circular doubly ll
// Today: February 23 2019

public class CircularLL<E> {
	public class Node {
		Node next;
		E data;
		public Node(E e) {
			data = e;
		}
	}
	Node head;
	public void printList() {
		if (head == null) {
			System.out.println("No list");
		}
		else {
			Node current = head;
			do {
				System.out.print(current.data + " ");
				current = current.next;
			}
			while (head != current);
		}
	}
	public void push(E e) {
		Node newNode = new Node(e);
		if (head == null ) {
			head = newNode;
			head.next = head;
		}
		Node endNode = head;
		while (endNode.next != head) {
			endNode = endNode.next;
		}
		newNode.next = head;
		endNode.next = newNode;
	}
	//@return true if deleted false if not found
	public boolean delete(E key) {
		if (head == null ) {
			throw new IllegalArgumentException("Empty List");
		}
		Node current = head;
		//Since not doubly linked, cannot go back to previous if current is
		//the node to be deleted.
		//Must check next node, therefore head must be checked prior to loop
		if (head.data.equals(key)) {
		    Node endNode = head;
		    //Change pointer at tail
		    while (endNode.next != head) {
		        endNode = endNode.next;
		    }
		    head = head.next;
		    endNode.next = head;
		    return true;
		}
		while (current.next != head) {
		    if (current.next.data.equals(key)) {
		        current.next = current.next.next;
		        return true;
		    }
		    current = current.next;
		}
		return false;
	}
    //Have one fast reach the end of the list and one slow
    //traverse normally. When fast reaches end, slow is at middle
	public Node getMiddle() {
	    Node slow = head;
	    Node fast = head;
	    if (head == null) {
	        throw new IllegalArgumentException("Empty List");
	    }
	    do {
	    	fast = fast.next.next;
	        slow = slow.next;
	    }
	    while (fast != head && fast.next != head);
	    return slow;
	}
	public static void main(String[] args) {
		CircularLL<Integer> aCircularLL = new CircularLL<Integer>(); 
		  
        aCircularLL.push(7); 
        aCircularLL.push(1); 
        aCircularLL.push(3); 
        aCircularLL.push(2); 
        aCircularLL.push(5);
        aCircularLL.push(8);
        aCircularLL.push(7);
        
        System.out.println("\nCreated Linked list is:"); 
        aCircularLL.printList(); 
  
        aCircularLL.delete(1);
  
        System.out.println("\nLinked List after Deletion of Key 1"); 
        aCircularLL.printList();
        aCircularLL.delete(7);
        
        System.out.println("\nLinked List after Deletion of First Instance of Key 7"); 
        aCircularLL.printList();
        aCircularLL.delete(8);
        
        System.out.println("\nLinked List Get Middle: " + aCircularLL.getMiddle().data);
     
        System.out.println("\nLinked List after Deletion of Key 8"); 
        aCircularLL.printList();
	}
}
