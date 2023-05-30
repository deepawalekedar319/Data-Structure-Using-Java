package kedar.java.linkedlist;

import java.util.Scanner;

public class UsingSingleLinkedList {

	public static void main(String[] args) {
		// main method stub
		
		SingleLinkedList linkedList = new SingleLinkedList();
		linkedList.displayLinkedList();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of elements you want to add :: " );
		int range =  scan.nextInt();
		
		for(int i=1;i<=range;i++) {
			System.out.print("Enter the " + i + " element :: "  );
			linkedList.addNode(scan.nextInt());			
		} // for			
		
		linkedList.displayLinkedList();
		
	} // main
} // class
