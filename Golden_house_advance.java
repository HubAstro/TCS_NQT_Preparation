package tcs;

import java.util.Scanner;

public class Golden_house_advance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int room[] = new int[n];
		
		int x=0;
		int index_st = 0, index_ed = 0;
		for(int i=0;i<n;i++) {
			room[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(x==0) {
				index_st = i+1;
			}
			if(x>=0 && x<k) {
				x = x+room[i];
			}else{
				x=0;
			}
			if(x == k) {
				index_ed = i+1;
				System.out.println(index_st+" "+index_ed);
				break;
			}
		}
		sc.close();
	}

}
