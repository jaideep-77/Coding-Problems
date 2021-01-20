package codeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ahahaha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases= in.nextInt();

		while(cases-->0) {
			int n = in.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i=0;i<n;i++) {
				arr.add(in.nextInt());
			}
			int counter=0;

			for(int i=0; i<arr.size();i++) {
				if(arr.get(i)==1) counter++;
			}

			if(counter<n/2) {
				for(int i=0;i<n/2;i++) {
					System.out.print("0 ");
				}
			}
			else {
				for(int j=0;j<n/2;j++)System.out.print("1 ");}

			System.out.println();
		}

	}
}
