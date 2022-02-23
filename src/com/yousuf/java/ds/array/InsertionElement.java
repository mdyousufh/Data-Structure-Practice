package com.yousuf.java.ds.array;

import java.util.Scanner;

public class InsertionElement {

	public static void main(String[] args) {

		  Scanner in = new Scanner(System.in);
			
			int i,n,insert;
			
			int[] a = new  int[10];
			System.out.print("Enter the size of array: ");
			
			n = in.nextInt();
			
			
			
			for(i=0;i<n;i++) {
				
				System.out.print("Enter the "+(i+1)+" element: ");
				
				a[i] = in.nextInt();
			}

			System.out.println("--------------------------");
			System.out.print("The array we have: ");
			
	        for(i=0;i<n;i++) {
				
				
	        	System.out.print(a[i]+"  ");
				
			}
	        
	    	System.out.println("  ");
			System.out.println("--------------------------");

			System.out.print("Enter the element you want to insert: ");
			insert = in.nextInt();
			System.out.println("  ");
			
			/*  Element insert logic Start*/
		
		
			a[i] =insert;
			
			/*  Element insert logic End*/
			
			System.out.println("--------------------------");
			
			  for(i=0;i<n+1;i++) { //n+1 increase
					
					
		        	System.out.print(a[i]+"  ");
					
				}
			 

	}

}
