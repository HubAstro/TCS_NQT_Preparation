package tcs;

import java.util.Scanner;

public class Count_Lowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str  = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
				System.out.print(ch);
			}
		}
		sc.close();
	}

}
