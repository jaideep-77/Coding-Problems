package codeForces;

import java.util.Scanner;

public class MinimumProduct {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();
		

		while(cases-->0) {
			int a  = in.nextInt(), b = in.nextInt(), x = in.nextInt(), y = in.nextInt(), n = in.nextInt();
			int remainder=0, nn=n, aa=a, bb=b;

			int maxNX = Math.max(a-n, x);
			
			if(maxNX==(a-n)) {
				remainder=0;
				a-=n;
			}
			else {
				remainder = n-(a-x);
				a-=(a-x);	
			}
		
			
			b=Math.max(b-remainder, y) ;
			
			long ans1 = (long) ((long)a) * ((long) b);
			
			a=aa;
			b=bb; 
			n=nn;
			
			
			int maxNY = Math.max(b-n, y);
			
			
			if(maxNY==(b-n)) {
				remainder=0;
				b-=n;
			}
			else {
				remainder= n-(b-y);
				b-=b-y;
			}
			
			 a = Math.max(a-remainder, x);
			
			
			long ans2 =  (long)a * b;
			
			
				System.out.println(Math.min(ans1, ans2)) ;
				
				
			
		}
	}

}
