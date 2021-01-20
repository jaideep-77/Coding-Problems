package codeForces;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		while(cases-->0) {
			long n = in.nextLong(), s = in.nextLong();
			long sum=0, counter=0, pow=10;
			
			while(getSum(n)>s) {
				counter+= pow - n%pow;
				n+=pow - n%pow;
				 pow*=10;
			}
			System.out.println(counter);
			
			
		}
	}
	
	static long getSum(long n) {
		long sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
