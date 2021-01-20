package codeForces;

import java.util.Scanner;

public class TwoIntegersProblems {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int tt = in.nextInt();
		
		while(tt-->0) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			/*
			 * Minimum number of moves required to go from b to a given you can add/subtract upto 10 every move
			 * Divide a - b   by 10 to figure out how many 10 do we need to add or subract
			 * If a-b remainder is not 0, then we need to add between 1 to 10 meaning making another move.
			 * thats why if a-b%10 != 0   then ans++
			 */
			int ans = Math.abs(a-b)/10;
			if((a-b)%10!=0)ans++;
			System.out.println(ans);
			
		}

	}

}
