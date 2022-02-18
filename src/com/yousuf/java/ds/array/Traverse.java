package com.yousuf.java.ds.array;

import java.util.Scanner;

public class Traverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] a = new int[10];
		
		int initial,number_of_input;
		
		System.out.println("How many Element you want to Input: ");
		number_of_input = input.nextInt();
		
		System.out.println("Now Enter The "+number_of_input+" Element: ");
		
		for(initial=0;initial<number_of_input;initial++) {
			
			a[initial]=input.nextInt();
			
		}
		
		System.out.println("Number of Element In the Array Index: ");
		
        for(initial=0;initial<number_of_input;initial++) {
			
			System.out.print(a[initial]+" , ");
			
		}
		

	}

}
