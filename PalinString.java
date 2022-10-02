package palString;

import java.util.Scanner;

public class PalinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String strInput = s.next();
		StringBuilder rev = new StringBuilder();
		for(int i=strInput.length();i>0;i--)
			rev.append(strInput.charAt(i-1));
		if(strInput.equals(rev.toString())) System.out.println(strInput+" is a Palindrome");
		else System.out.println(strInput+" is not a Palindrome");
		
		s.close();
	}

}
