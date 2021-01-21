package problems;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words= {"flower", "float", "flight"};
		System.out.println(longestPrefix(words));
	}

	public static String longestPrefix(String[] strs) {
		
		// return nothing if array is empty
		if(strs.length<1)return"";
		/*
		 *  smallest variable is just used to compare it to other prefix.
		 *  Any prefix will either be same length as the word or smaller. 
		 *  never bigger
		 */
	        String smallest=strs[0];
			
	        /*
	         * J loop is used to iterate through every word of the array
	         * I loop is used to compare 1st word in the array to every other word
	         * charCounter is used to iterate through every character in the word
	         */
			
			for(int j=1;j<strs.length;j++ ) {
				String prefix="";
			int charCounter=0;
			for(int i=0; i<strs[0].length();i++) {
				
				/*
				 * This code compares 1st word to every word and check how many of the starting characters are same 
				 * It then adds those characteres to the prefix variable
				 * Prefix variable becomes nothing after the start of every loop to store the next prefix
				 * smallest variable is used to store previous prefix and it is updated after every loop based on whether new prefix is smaller or bigger
				 */
				if( (charCounter<strs[0].length() && charCounter<strs[j].length() )&&  strs[0].charAt(charCounter)==strs[j].charAt(charCounter)) {
					prefix+=strs[j].charAt(charCounter);
					charCounter++;
				} 
				else break;
			}
			
			/*
			 * This determines if the new prefix is bigger or smaller
			 * If new prefix is bigger it means it is not present in other words
			 * therefore we only care about smaller prefix
			 */
			if(prefix.length()<smallest.length())smallest=prefix;
		
			}
			return smallest;
	}
}
