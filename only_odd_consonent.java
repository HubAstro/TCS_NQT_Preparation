package tcs;

import java.util.*;

public class only_odd_consonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(((i+1)%2)==1) {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U') {
					continue;
				}else {
					System.out.println(ch);
				}
			}
		}
		sc.close();
	}

}
