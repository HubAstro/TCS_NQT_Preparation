package tcs;

import java.util.*;

public class khokho_advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int f[] = new int[n];
		
		for(int i=0;i<n;i++) {
			f[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(f[0]==f[n-1]) {
				System.out.println("For everyone");
				break;
			}else if(f[i]==f[1]) {
				System.out.println(i+1);
			}
		}
		sc.close();
	}

}
