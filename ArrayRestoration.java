package codeForces;

import java.util.Scanner;

public class ArrayRestoration {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();

		while(cases-->0) {
			int n = in.nextInt(), x = in.nextInt() , y = in.nextInt();


			int max = Integer.MAX_VALUE;
			int[] best= {};

			for(int start=1;start<=50;start++) {
				for(int diff=1;diff<=50;diff++) {
					int[] arr = solve(n,start,diff);

					boolean hasX=false, hasY = false; 
					for(int i:arr) {
						if(i==x)hasX=true;
						if(i==y)hasY=true;
					}
					
					if(hasX&&hasY && arr[n-1]<max) {
						max=arr[n-1];
						best=arr;
					}

				}
			}
			
			for(int i: best)
				System.out.print(i+" ");
			System.out.println();

		}

	}

	static int[] solve(int n, int start, int diff) {
		int[] arr = new int[n];
		arr[0]=start;
		for(int i=1;i<n;i++) {
			arr[i]=arr[i-1]+diff;
		}
		return arr;
	}

}
