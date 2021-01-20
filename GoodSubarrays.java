package codeForces;
import java.util.Arrays;
import java.util.Scanner;
 
public class GoodSubarrays {
 
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int cases=in.nextInt();
 
 
		for(int t=0;t<cases;t++) {
			int length= in.nextInt();
			int[] arr = new int[length];
 
			String line = in.next();
 
			char[] array= line.toCharArray();
 
 
			for(int i=0;i<line.length();i++) {
				arr[i]= Integer.valueOf(String.valueOf(array[i]));
			}
 
 
			int total=1;
			int sum=0;
			int goodArrays=0;
 
			/*
			 * This code will go through array many times to check how many consecutive Subarrays we can find.
			 * After every J loop, we increase the j so that we can start again from the 2nd number in the array.
			 */
			
			for(int j=0;j<arr.length;j++) {
				sum=0;
				total=1;
				for(int i=j;i<arr.length;i++) {
					sum+=arr[i];
					
					if(sum==total) {
						goodArrays++;
					}
					total++;
				}
			}
			
			System.out.println(goodArrays);
		}
	}
	

 
}