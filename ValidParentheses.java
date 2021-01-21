package problems;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		

		System.out.println(isValid("((([[{))}]])))"));
	}
	public static boolean isValid(String s) {
		
		
		boolean result=true;
		char[] arr=s.toCharArray();
		
		Stack<Character> stk= new Stack<>();
		for(char c:arr) {
			if(c=='(' || c=='[' || c=='{')stk.push(c);
			else {
				if(!stk.isEmpty()) {
					
				
				char compare = stk.peek();
				if(compare=='(' && c==')')stk.pop();
				else if (compare=='[' && c==']')stk.pop();
				else if (compare=='{' && c=='}')stk.pop();
				else {
					result=false;
					break;
				} 
			}
				else result=false;
		}
		}
			if(s.isEmpty())result= true;
			 return result;
		
	}

}

