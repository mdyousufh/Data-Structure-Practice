package com.yousuf.java.ds.linkedlists;

public class SingleLinkedList {

	// Structure of Node

	static class Node {

		int data;
		Node next;
	}

	// Node element print method
	static void printList(Node n) {

		while (n != null) {

			System.out.println(n.data + " ");
			n = n.next;

		}
	}

	public static void main(String[] args) {

		Node head = null;
		Node second = null;
		Node third = null;

		head = new Node();
		second = new Node();
		third = new Node();

		head.data = 1;
		head.next = second;

		second.data = 2;
		second.next = third;

		third.data = 3;
		third.next = null;

		printList(head);

	}

}
