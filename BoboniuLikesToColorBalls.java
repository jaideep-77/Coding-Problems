package codeForces;
import java.io.PrintWriter;
import java.util.Scanner;

public class BoboniuLikesToColorBalls {

	public static void main(String[] args) {

		/*
		 * Using printwriter because its faster and easier to type code (doesn't have to type system)
		 */
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		try {
		
			int tt=sc.nextInt();

			for(int i=0;i<tt;i++) {

				String result="No";
			
				int red=sc.nextInt(), blue=sc.nextInt(), green=sc.nextInt(), white=sc.nextInt(); 

				if(checkAllEven(red, blue, green, white) || checkThreeEven(red, blue, green, white )|| checkThreeOdd(red, blue, green, white) ) {
					result="Yes";
				}


				out.println(result);

			}
			out.close();
		} catch (Exception e){
			System.out.println("Error!");
		}
	}

	/*
	 * This method checks if all the balls- red blue green and white are even.
	 * If they are all even then they can be placed in a palindrome- a word which reads the same front and back.
	 */
	public static boolean checkAllEven(int redBall, int blueBall, int greenBall, int whiteBall) {
		boolean redEven = (redBall % 2 == 0)? true : false;
		boolean blueEven = (blueBall % 2 == 0)? true : false;
		boolean greenEven = (greenBall % 2 == 0)? true : false;
		boolean whiteEven = (whiteBall % 2 == 0)? true : false;

		if(redEven && blueEven && greenEven && whiteEven) return true;
		else return false;
	}

	/*
	 * This method checks if 3 of these values are even or not. 
	 * Because if 1 is odd and rest are even, they can be put into a palindrome
	 * Ex: 1111222233334333322221111 where 1, 2 , 3 are even and 4 is odd
	 */
	public static boolean checkThreeEven(int redBall, int blueBall, int greenBall, int whiteBall) {
		boolean redEven = (redBall % 2 == 0)? true : false;
		boolean blueEven = (blueBall % 2 == 0)? true : false;
		boolean greenEven = (greenBall % 2 == 0)? true : false;
		boolean whiteEven = (whiteBall % 2 == 0)? true : false;

		int oddCounter=0;
		if(!redEven)oddCounter++;
		if(!blueEven)oddCounter++;
		if(!greenEven)oddCounter++;
		if(!whiteEven)oddCounter++;

		if(oddCounter>1)return false;
		else return true;
	}

	/*
	 * This method checks if there are more than 3 balls odd and makes sure there are atleast 1 red, blue and green ball.
	 * Because 1 red, 1 blue and 1 green can be used to  make 3 whiteballs.
	 * If 4 are odd then they all can become even.
	 * Every odd ball other than white can subtact one ball making it even and white balls adds 3 making it even or odd depending upon the value of white balls.
	 * 
	 */
	public static boolean checkThreeOdd(int red, int blue, int green, int white) {
		boolean redEven = (red % 2 == 0)? true : false;
		boolean blueEven = (blue % 2 == 0)? true : false;
		boolean greenEven = (green % 2 == 0)? true : false;
		boolean whiteEven = (white % 2 == 0)? true : false;

		int oddCounter=0;
		if(!redEven)oddCounter++;
		if(!blueEven)oddCounter++;
		if(!greenEven)oddCounter++;
		if(!whiteEven)oddCounter++;

		if(oddCounter>=3 && red!=0 && blue!=0 && green!=0)return true;
		else return false;
	}
}