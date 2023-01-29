package com.yousuf.java.ds.linkedlists;

public class SinglyLinkedListUsingScanner {

	// Creating Node Structure
	static class Node {

		int data;
		Node next;

	}

	// inserting method at Node
	static void insertNode(Node head, int data) {

		Node currentNode = head;
		
		Node temp = new Node();
		temp.data = data;
		temp.next =null;
		
		while(currentNode.next !=null) {
			currentNode = currentNode.next;
			
		}

	}

	public static void main(String[] args) {

	}

}
