package com.yousuf.java.ds.array;

import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
		
		int i,n,delete;
		
		boolean flag = false;
		
		System.out.print("Enter the size of array: ");
		
		n = in.nextInt();
		
		int[] a = new  int[n];
		
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

		System.out.print("Enter the element you want to delete: ");
		delete = in.nextInt();
		System.out.println("  ");
		
		/*  Element delete logic Start*/
	
		for(i=0;i<n;i++) {
			
			if(delete == a[i]) {
				
				 for (int j=i; j < n - 1; j++) {
			            a[j] = a[j + 1];    // shifting element.
			        }
				n--; // decrease array length.
				
				System.out.println("Element deleted successfully.");
				flag = true;
				break;
				
			}
			
			
			
		}
		/*  Element delete logic End*/
		
		if(flag == false) {
			
			System.out.println("Element not found.");
			
		}
		
		else {
			
			System.out.println("  ");
			System.out.println("--------------------------");
			System.out.println("  ");
			System.out.println("After deleted we have element in the array:");
			
	        for(i=0;i<n;i++) {
				
				
	        	System.out.print(a[i]+"  ");
				
			}
			
			
		}
		 
		
	}

}
