package codeForces;

import java.util.Arrays;
import java.util.Scanner;

public class JugglingLetters {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int cases = in.nextInt();

		while(cases-->0) {
			int []letterFrequency = new int[26];
			int n = in.nextInt();

			for(int j=0; j<n;j++) {

				String s = in.next();

				/*
				 * This loop goes through every word in the string and increments the character's frequency
				 * s.charAt(i)-'a'  finds the correct index to be incremented. 
				 * a-a == 0         b-a == 1
				 */
				for(int i=0;i<s.length();i++) {
					letterFrequency[s.charAt(i)-'a']++;
				}

			}


			String result ="";
			for(int i:letterFrequency) {
				
				/*
				 * This if statements checks if there are as many as characters for every string
				 * Checks each alphabet's number by taking remainder by n.
				 * If there are 3 strings, each alphabet should be a multiple of 3 so that 
				 * each of the 3 strings can have same number of certain alphabets
				 */
				if( i  % n!=0) {
					result ="No";
					break;
				}
			}
			if(result.equals("No"))System.out.println(result);
			else System.out.println("Yes");


		}

	}

}
