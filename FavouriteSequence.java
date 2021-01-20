package codeForces;

import java.util.Scanner;

public class FavouriteSequence {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int tt = in.nextInt();
while(tt-->0) {
	int n = in.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i< n; i++) {
		arr[i] = in.nextInt();
	}
	
	String ans = "";
	int leftCounter = 0;
	int rightCounter = n-1;
	for(int i = 0; i<n; i++) {
		if(i%2==0) {
			ans += arr[leftCounter] +" ";
			leftCounter++;
		}
		
		if(i%2==1) {
			ans += arr[rightCounter] +" ";
			rightCounter--;
		}
	}
	System.out.println(ans);
}
	}

}
