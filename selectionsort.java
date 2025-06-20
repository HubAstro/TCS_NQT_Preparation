package tcs;

import java.util.*;

public class selectionsort {

	static void display(int arr[]) {
		System.out.println("After sorting:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	static void sort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		
		display(arr);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("before sorting:");
		for(int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}
		sort(arr);
		sc.close();
	}

}
