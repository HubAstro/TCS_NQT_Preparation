package tcs;

import java.util.*;

public class Supermarket_price_advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int len = str.length();
		char ch[] = new char[len];
		
		for(int i=0;i<len;i++) {
			ch[i] = str.charAt(i);
			
		}
		int ch1[] =  new int[len];
		int res = 1;
		
		for(int i=0;i<len;i++) {
			ch1[i] = Character.getNumericValue(ch[i]);
			res = res*ch1[i];
		}
		System.out.print(res);
		sc.close();
	}

}
