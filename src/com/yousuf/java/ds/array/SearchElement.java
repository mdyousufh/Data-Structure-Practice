package com.yousuf.java.ds.array;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

        int initial=0,number_of_input,search;
        
        boolean flag = false;
		
		System.out.print("How many Element you want to Input: ");
		number_of_input = input.nextInt();
		int[] array = new int[number_of_input];
		
		System.out.print("Now Enter The "+number_of_input+" Element: ");
		
		for(initial=0;initial<number_of_input;initial++) {
			
			array[initial]=input.nextInt();
			
		}
		
		System.out.println("Enter element to Search: ");
		
		search = input.nextInt();
		
      
		for(initial=0; initial<number_of_input; initial++) {
			
			if(array[initial]==search) {
				
				System.out.println("Element found: "+search);
				System.out.println("Element found at index: "+array[initial + 1]);
				flag=true;
				break;
				
			}
			
		}
		
		if(flag == false) {
			
			System.out.println("Element not Found");
			
		}
		

	}

}
