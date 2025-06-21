package tcs;

import java.util.*;

public class Fibbonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] m =new int[n];
		for(int i=0;i<n;i++) {
			if(i==0||i==1) {
				m[i]=i;
				System.out.print(m[i]);
				System.out.print(" ");
			}else if(i>=2) {
				m[i]=m[i-1]+m[i-2];
				if(m[i]<=20 && m[i]>=0) {
					System.out.print(m[i]);
					System.out.print(" ");
				}
			}else {
				break;
			}
		}
		sc.close();
	}

}
