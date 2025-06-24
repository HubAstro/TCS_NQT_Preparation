package tcs;

import java.util.*;

public class Factorial_withoutrecur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int n = sc.nextInt();
		int ans = 1;
		
		for(int i=1;i<=n;i++) {
			ans = ans * i;
		}
		System.out.print("Factorial of "+n+" is "+ans);
		sc.close();
	}

}
