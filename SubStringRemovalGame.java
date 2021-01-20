package codeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class SubStringRemovalGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t=in.nextInt();
		for(int tt=0; tt<t; tt++) {
			String line = in.next();
			ArrayList<String> arr = new ArrayList<>();


			for(int i=0;i<line.length();i++) {
				if(line.charAt(i)=='1') {
					int start =i;
					while(i<line.length()-1 &&line.charAt(i+1)=='1') {
						i++;
					}
					int end= i+1;
					arr.add(line.substring(start, end));
				}
			}

			Collections.sort(arr);
			Collections.reverse(arr);

			int score=0;
			for(int i=0;i<arr.size();i+=2) {
				score+=arr.get(i).length();
			}
			System.out.println(score);
		}
	}
}
