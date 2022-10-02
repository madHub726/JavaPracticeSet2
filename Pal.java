package palindrome;

import java.util.Scanner;

public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int rev = 0;
		int temp=num;
		int dig = String.valueOf(num).length();
		for(int i=0; i<dig; i++) {
			rev = (rev*10)+(temp%10);
			//System.out.println(rev);
			temp = temp/10;
		}
		if(num==rev) System.out.println(num+" is a Palindrome");
		else System.out.println(num+" is not a Palindrome");
		
		s.close();
	}

}
