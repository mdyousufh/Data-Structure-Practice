package com.yousuf.java.ds.stacks;

public class Stack {

	private int[] array;
	private int top;
	private int capacity;
	
	public Stack(int size) {
		
		array = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x) {
		if(isFull()) {
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}
		
		System.out.println("Inserting " + x);
		array[++top]=x;
		
	}
	
	public  int pop() {
		if(isEmpty()) {
			  System.out.println("STACK EMPTY");
		      System.exit(1);
			
		}
		return array[top--];
		
	}
	public Boolean isEmpty() {
	    return top == -1;
	  }
	  public Boolean isFull() {
		    return top == capacity - 1;
		  }
	
	  public void printStack() {
		    for (int i = 0; i <= top; i++) {
		      System.out.println(array[i]);
		    }
		  }

	public static void main(String[] args) {
		Stack obj = new Stack(4);
		
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(8);
		System.out.println("\nAfer pushing");
		obj.printStack();
		
		

	}

}
