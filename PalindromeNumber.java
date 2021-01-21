package problems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int x) {
        int temp=x;
        if(x<0)return false;
        
        else {
            int num=0;
            while(true){
            num+=x%10;
            x/=10;
            if(x==0)break;
            num*=10;  
                
        }
            System.out.println(num);
          if(num==temp)return true;
            else return false;
        }
    }
}
