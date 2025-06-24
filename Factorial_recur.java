package tcs;

import java.util.*;


class Fact {
	int x=1;
	int factorial(int n) {
		if(n==1) {
			return x; 
		}else {
			x = x*n;
			return (factorial(n-1));
		}
	}
}

public class Factorial_recur {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int n = sc.nextInt();
		
		Fact fa = new Fact();
		
		int ans = fa.factorial(n);
		
		System.out.println("Factorial of "+n+" is "+ans);

		sc.close();
	}

}
