package com.bridgelabz;

import java.util.Scanner;

public class PrintArrayElements {
	static void printArrayElements(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+ n +" elements : ");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		printArrayElements(arr);
	}

}
