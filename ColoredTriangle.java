package codeForces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ColoredTriangle {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int r= in.nextInt(), g=in.nextInt(), b=in.nextInt();
		ArrayList<Integer> red = new ArrayList<>();
		ArrayList<Integer> green = new ArrayList<>();
		ArrayList<Integer> blue = new ArrayList<>();

		for(int i=0;i<r;i++) 
			red.add(in.nextInt());
		for(int i=0;i<g;i++)
			green.add(in.nextInt());
		for(int i=0;i<b;i++) 
			blue.add(in.nextInt());

		Collections.sort(red);
		Collections.sort(green);
		Collections.sort(blue);

		int redCounter = r-1;
		int greenCounter = g-1;
		int blueCounter = b-1;
		int ans=0;
		int max=0;
		int middle=0;


		System.out.println(ans);

	}
	private static int maxValue(int a, int b, int c) {
		int maxAB= Math.max(a, b);
		int maxAll= Math.max(c, maxAB);
		return maxAll;
	}

	private static int middleValue(int a, int b, int c) {
		int maxAB= Math.max(a, b);
		int middle= Math.min(c, maxAB);
		return middle;
	}

	private static boolean checkCounters(int a, int b, int c) {
		boolean result;
		if(a>-1 && b>-1 && c>-1 )return true;
		else if (b>-1 && (a>-1 || c>-1 ))return true;
		else return false;
	}

}
