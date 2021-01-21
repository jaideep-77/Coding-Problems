package problems;

import java.util.HashMap;
import java.util.Scanner;

public class LSystemGo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

for(int tt=0;tt<10;tt++) {
		int r= in.nextInt();
		int t= in.nextInt();
		String ans = in.next();

		HashMap<String,String> map = new HashMap<>();
		for(int i=0;i<r;i++) {
			map.put(in.next(),in.next());
		}
		
		
		for(int iterations=0; iterations<t;iterations++) {
			StringBuilder temp = new StringBuilder();
			for(int i=0; i<ans.length();i++) {
				if(map.containsKey(Character.toString(ans.charAt(i)))) {
					temp.append(map.get(Character.toString(ans.charAt(i))));
				}
			}
			ans=temp.toString();
		}
	
		
		String result= ans.charAt(0)+""+ans.charAt(ans.length()-1) + " "+ans.length();
		
		System.out.println(result);
	}
	}
}
