package tcs;

import java.util.Scanner;

public class min_char {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String str = s.toLowerCase();
		
		char ch = str.charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(ch>str.charAt(i)) {
				ch = str.charAt(i);
			}
		}
		System.out.println(ch);
		
		sc.close();
	}
}
