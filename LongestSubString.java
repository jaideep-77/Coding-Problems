package leetCode;

import java.util.ArrayList;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));

	}
	public static int lengthOfLongestSubstring(String s) {

		ArrayList<String> arr = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		StringBuilder track = new StringBuilder();

		for(int i=0; i<s.length()-1; i++){
			for(int j=1+1; j<s.length(); j++){
				if (s.charAt(i)!= s.charAt(j) && !track.toString().contains(s.charAt(j)+"")){
					sb.append(s.charAt(j-1));
					track.append(s.charAt(j-1));
				} 
				else {
					sb.append(s.charAt(j));
					arr.add(sb.toString());
					sb.setLength(0);
					track.setLength(0);
					break;

				}
			}
		}
		int largest = 0; 
		int index = -1;
		for(int i=0; i<arr.size(); i++){
			if(arr.get(i).length()>largest){
				largest = arr.get(i).length();
				index = i;
			}
		}
		return largest;
	}
}