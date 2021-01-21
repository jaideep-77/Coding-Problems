package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FreeShirts {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);



		for(int t=0;t<10;t++) {
			int originalShirts = in.nextInt();
			int numShirts=originalShirts;
			int numEvents = in.nextInt();
			int days = in.nextInt();

			int laundry=0;

			int[] events = new int[days];
			for(int i=0; i<days;i++) {
				events[i]=0;
			}

			for(int i=0;i<numEvents;i++) {
				int index= in.nextInt();
				events[index-1]++;
			}


			for(int i=0; i<days;i++) {
				if(numShirts==0) {
					laundry++;
					numShirts=originalShirts;
				}
				int increase = events[i];
				numShirts+=increase;
				originalShirts+=increase;
				numShirts--;
			}

			System.out.println(laundry);
		}



	}
}