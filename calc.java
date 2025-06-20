package tcs;

import java.util.*;

public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,x,y;
		
		while(true) {
			System.out.print("1.add\n2.sub\n3.mul\n4.div\n5.exit\nEnter number:");
			n = sc.nextInt();
			if(n==5) {
				break;
			}
			System.out.println("Enter number 1:");
			x = sc.nextInt();
			System.out.println("Enter number 2:");
			y = sc.nextInt();
			switch(n) {
				case 1:
					System.out.println("Addition: "+(x+y));
					break;
				case 2:
					System.out.println("Subtraction: "+(x-y));
					break;
				case 3:
					System.out.println("Multiplication: "+(x*y));
					break;
				case 4:
					System.out.println("Division: "+(x/y));
					break;
				default:
					System.out.println("Enter proper options");
					break;
			}
		}
		sc.close();
	}

}
