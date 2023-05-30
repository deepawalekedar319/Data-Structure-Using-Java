/*
 	Single Linked List Creation
 */
package kedar.java.linkedlist;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

@SuppressWarnings("unused")
public class SingleLinkedList {
	
	class LinkedListNode{
		
		int value;
		LinkedListNode next;
		
		public LinkedListNode(int value) {
			// constructor
			this.value = value;
			this.next = null;			
		} // constructor

	} // inner class - Node Class		
	// head and tail of LinkedList
	LinkedListNode head = null;
	LinkedListNode tail = null;
	
	public void displayLinkedList() {
		// method stub
		
		LinkedListNode current = head;
		
		if(head == null) {
			System.out.println("Linked List is empty");
		} // if 
		else {
			System.out.println("The Nodes of the Linked List are :: ");
			while(current != null) {
				System.out.print(current.value + " --> ");
				current = current.next;
			} // while
			System.out.println("null");
		} // else
		
	} // method stub
	
	public void addNode(int data) {
		// method stub
		
		LinkedListNode node = new LinkedListNode(data);
		
		if(head == null) {
			head = node;
			tail = node;
		} // if
		else {
			tail.next = node;
			tail = node;
		} // else
	} // method

} // class
