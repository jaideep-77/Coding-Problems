package codeForces;

import java.util.Scanner;

public class LastYearSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		while(tt-->0) {

			int length = in.nextInt();
			String words = in.next();
			
			if(words.startsWith("2020")|| words.endsWith("2020") || words.startsWith("20") && words.endsWith("20") || (words.startsWith("202") && words.endsWith("0")) || words.startsWith("2") && words.endsWith("020"))
			System.out.println("Yes");
			else System.out.println("no");
			
			
		}
	}

}


