package com.yousuf.java.ds.array;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] a = new  int[10];
		
		int i,n,position,value;
		
		System.out.print("Enter the size of array: ");
		
		n = in.nextInt();
		
		for(i=0;i<n;i++) {
			
			System.out.print("Enter the "+(i+1)+" element: ");
			
			a[i] = in.nextInt();
		}

		System.out.println("--------------------------");
		System.out.print("The array we have: ");
		
        for(i=0;i<n;i++) {
			
			
        	System.out.print(a[i]+" , ");
			
		}
        
    	System.out.println("  ");
		System.out.println("--------------------------");

		System.out.print("Enter the position you want to update: ");
		position = in.nextInt();
		System.out.println("  ");
		
        System.out.print("Enter the new value: ");
        value = in.nextInt();
        a[position-1] = value;
        
        
		System.out.println("  ");
		System.out.println("The updated array is ");
		System.out.println("  ");
		System.out.println("--------------------------");
		

        for(i=0;i<n;i++) {
			
			
        	System.out.print(a[i]+" , ");
			
		}
		
	}

}
