package tcs;

//aabbbcc = a2b3c2
//abbccc = a1b2c3

import java.util.*;
public class charrepeat {
	
	static void result(String str, int length, char ch, int samp) {
		int count = 0;
		
		for(int i=0;i<length;i++) {
			if(ch == str.charAt(i)) {
				count++;
				samp++;
			}
		}
		System.out.print(ch+""+count);
		if(samp<length) {
			ch = str.charAt(samp);
			result(str, length, ch, samp);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String  str = sc.next();
		char ch = str.charAt(0);
		int length = str.length();
		int samp = 0;
		
		result(str, length, ch, samp);
		
		sc.close();
	}
}