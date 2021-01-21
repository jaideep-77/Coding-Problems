package leetCode;

import java.util.Arrays;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public  boolean isValid(String s) {


		char[] arr = s.toCharArray();
		char[] copy = new char[s.length()];
		int index = s.length()-1;
		for(char c: arr) {
			if(c=='(')   copy[index] += ')';
			else if (c=='[' )copy[index] += ']';
			else if (c=='{' )copy[index] += '}';
			else if(c==')')   copy[index] += '(';
			else if (c==']' )copy[index] += '[';
			else if (c=='}' )copy[index] += '{';

			index--;
		}
		String str = Arrays.toString(arr);
		String str2 = Arrays.toString(copy);
		if(str.equals(str2)) return true;
		else return false;
	}
}
