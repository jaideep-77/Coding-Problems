package problems;

import java.util.*;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;
public class CountAndSay {

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(solve(num));
		
	}
	/**
	 * 
	 * @param n
	 * @return
	 * @throws 
	 */
	public static String solve(int n) {
		String num="1";
		
		/*
		 * j loop starts at 1 because the starting string '1' is already given. 
		 * So next number will be 11 which is actually 2nd in this sequence.
		 */
		for(int j=1;j<n;j++) {
			
			// Used a stringbuilder to save some space
		StringBuilder temp= new StringBuilder();
		for(int i=0;i<num.length();i++) {
			
			/*
			 * This block counts  how many times a number is repeated and stores frequency and the value of the number in stringbuilder.
			 */
			int frequency=1;
			while(i<=num.length()-2 && num.charAt(i)==num.charAt(i+1)) {
				frequency++;
				i++;
			}
			temp.append(frequency).append(num.charAt(i));
		}
		
		/*
		 * now the frequency and value is stored in num.
		 * After everyloop this value is updated
		 * as everynumber is based on the previous number
		 */
		num=temp.toString();
		
		
		}
	
		return num;
	}
}

