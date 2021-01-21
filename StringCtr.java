package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;



public class StringCtr implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o2.length() != o1.length())
			return o2.length() - o1.length();
		return o2.charAt(0) - o1.charAt(0);
	}

	public static void main(String[] args) {
		String[] arr = {"hello", "the", "beautiful", "worlds", "bye"};
		Arrays.sort(arr);
		for(String s: arr) 
			System.out.print(s+ " ");
		System.out.println();
		
		
		String[] arr2 = {"hello", "the", "beautiful", "worlds", "bye"};
		Arrays.sort(arr2, new StringCtr());
		for(String s: arr2)
			System.out.print(s+" ");
	}



}
