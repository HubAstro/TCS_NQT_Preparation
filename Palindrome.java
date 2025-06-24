package tcs;


public class Palindrome {

	public static void main(String[] args) {
		String str = "121";
		int n = str.length();
		
		boolean ans = true;
		char ch[] = new char[n];
		
		for(int i=n-1;i>=0;i--) {
			ch[i] = str.charAt(i);
		}
		
		String str2 = new String(ch);
		
		System.out.println(str2);
		if(str.equals(str2)) {
			System.out.print("Palindrome");
		}else {
			System.out.print("not a palindrome");
		}
	}

}
