package tcs;

import java.util.*;

public class Horse_bet_advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=0,count[]=new int[50];
		int z=0;
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int horse[] = new int[n];
		
		for(int i=0;i<n;i++) {
			horse[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if((x+horse[i])<k) {
				x = x+horse[i];
				count[z] = count[z]+1;
			}
			if((x+horse[i])>k) {
				z++;
				x=0;
			}
		}
		int max = count[0];
		for(int j=0;j<z;j++) {
			if(max>count[j]) {
				max = count[j];
			}
		}
		System.out.println(max);
		sc.close();
	}

}
