package tcs;

import java.util.*;

public class consecutive2vowels {

	static boolean islower(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char ch,ch1;
		String[] str1 = str.split(" ");
		int x = str1.length;
		for(int i=0;i<x;i++) {
			int len = str1[i].length();
			for(int j=0;j<len-1;j++) {
				ch = str1[i].charAt(j);
				ch1 = str1[i].charAt(j+1);
				if((islower(ch) == true) && (islower(ch1)==true)) {
					System.out.println(str1[i]);
				}
			}
		}
		
		sc.close();
	}

}
