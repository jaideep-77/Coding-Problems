package codeForces;

import java.io.PrintWriter;
import java.util.Scanner;

public class BoboniuPlaysChess {

	// Row counter will determine starting x position for the next row. Since I am filling the rows X will either be at 0 or N.
	static int rowCounter=0;
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		PrintWriter out= new PrintWriter(System.out);
		
		int N = in.nextInt();
		int M = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		
		int yOriginal= y;
		
		
		/*
		 * CONCEPT: Write down all the possible squares on the starting row. X value at the end of starting row will be 1.
		 * Then go to row 1 and start doing the same thing
		 * Then move up the row but keeping in mind you can start at 1 or at N (I Used row counter to keep record of x value). 
		 * When you encounter the starting row, skip it and do the next one. (I used yOriginal to check if I am at starting row)
		 */
		
		fillRow(x,y,N);
		 y=1;

		
		// Now fill the rows until you reach M. When finished move to rows on the otherside (yOriginal-1)
		while(y<=M) {
			if(rowCounter%2 == 1)x=1;
			else x=N;
			if(y==yOriginal)y++;
			fillRow(x,y,N);
			y++;
		}
	

	}
	
	
	/**
	 * This method fills out all the squares a rook can move to starting at x,y position
	 * Row counter is used to determine new x value when you move to a new row because you cannot visit a square twice.
	 * @param x
	 * @param y
	 * @param N
	 */
private static void fillRow(int x, int y, int N) {
	
	int startingX = x;
	while(x<=N ) {
		System.out.println(x + " " + y);
		x++;
	}
	x= startingX-1;
	while(x>0 ) {
		System.out.println(x + " " + y);
		x--;
	}
	rowCounter++;
}


}
