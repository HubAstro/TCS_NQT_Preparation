package tcs;

import java.util.*;

public class Count_Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String str1[] = str.split(" ");
		
		int len = str1.length;
		
		System.out.println("Total words:"+len);
		
		for(int i=0;i<len;i++) {
			
			System.out.println(str1[i]);
		}
		sc.close();
	}

}
