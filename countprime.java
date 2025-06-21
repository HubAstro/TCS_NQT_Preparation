package tcs;

import java.util.*;

public class countprime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int x = Character.getNumericValue(ch);
			for(int j=1;j<=x;j++) {
				if(((x%j)==0)) {
					count = count+1;
				}
			}
			if(count == 2) {
				System.out.println(x);
			}
			count = 0;
		}
		sc.close();
	}

}
