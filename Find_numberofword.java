package tcs;

import java.util.*;

public class Find_numberofword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String str1[] = str.split(" ");
		
		System.out.print("Enter the word to search: ");
		String in = sc.nextLine();
		
		int count = 0;
		int x = str1.length;
		for(int i=0;i<x;i++) {
			if(str1[i].equals(in)) {
				count++;
			}
		}
		System.out.println("The word "+in+" found in "+count+" places");
		sc.close();
	}
}
