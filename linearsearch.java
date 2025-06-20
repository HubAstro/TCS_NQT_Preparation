package tcs;

import java.util.*;

public class linearsearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array value:");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter value to search:");
		int x = sc.nextInt();
		
		for(int j=0;j<n;j++) {
			if(arr[j]==x) {
				System.out.print("Array value " +x+" found in index number: "+j);
			}
		}
		sc.close();
	}

}
