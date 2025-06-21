package tcs;

import java.util.*;

public class Count_vowelword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str1[] = str.split(" ");
		
		int x = str1.length;
		
		int count=0;
		
		for(int i=0;i<x;i++) {
			char ch = str1[i].charAt(0);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println(str1[i]+" ");
				count++;
			}
		}
		System.out.println("Total words that starts with vowel: "+count);
		sc.close();
		
		
	}

}
