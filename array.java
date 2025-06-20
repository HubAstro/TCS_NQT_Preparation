package tcs;

import java.util.*;

public class array {

	
	static void display(int arr[]) {
		int x = arr.length;
		System.out.println("Length of the array: "+x);
		
		for(int i=0;i<x;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array lenght: ");
		
		n = sc.nextInt();

		int array[] = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		display(array);
		
		sc.close();
	}

}
