package tcs;

/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/

import java.util.Scanner;

public class disp_char_odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int l = str.length();
		
		for(int i=0;i<l;i++) {
			if((i%2)==1) {
				System.out.print(str.charAt(i));
			}
		}
		sc.close();
	}

}
