package codeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class OmkarAndPassword {

	public static void main(String[] args) {
		
	  	Scanner in = new Scanner(System.in);
	 
		int num=in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<num;i++) {
			arr.add(i,in.nextInt());
		}
		int index=0;
		while(index<arr.size()-1) {
			if(arr.get(index)==arr.get(index+1)) {
				arr.set(index,arr.get(index)+arr.get(index+1));
				removeIndex(arr, index);
			}
		}
		System.out.println(arr.size());

	}
	private static ArrayList<Integer> removeIndex(ArrayList<Integer> a, int index) {
		while(index<a.size()-1) {
			a.set(index, a.get(index+1));
			index++;
		}
		a.remove(a.size()-1);
		return a;
		
	}

}
