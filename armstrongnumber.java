package tcs;

import java.util.*;

public class armstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int l = str.length();
		double res = 0, pow;
		int x;
		char ch;
		for(int i=0;i<l;i++) {
			ch = str.charAt(i);
			x = Character.getNumericValue(ch);
			pow = Math.pow(x, l);
			res = res+pow;
		}
		
		int ip = Integer.parseInt(str);
		if(res == ip) {
			System.out.print("Armstrong Number");
		}else {
			System.out.print("Not an armstrong number");
		}
		sc.close();
	}

}
