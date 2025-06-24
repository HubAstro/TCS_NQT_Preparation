package tcs;

import java.util.*;

public class Reverse_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int rev[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int x = 0;
		for(int i=n-1;i>=0;i--) {
			rev[x] = arr[i];
			x++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(rev[i]);
		}
		sc.close();	
	}

}
