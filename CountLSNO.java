package countingCharacters;

import java.util.Scanner;

public class CountLSNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = s.nextLine();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0; i<str.length();i++)
			if(Character.isLetter(str.charAt(i))) letter++;
			else if(Character.isDigit(str.charAt(i))) num++;
			else if(Character.isSpaceChar(str.charAt(i))) space++;
			else other++;
		System.out.println("Letters = "+letter+", Spaces = "+space);
		System.out.println("Numbers = "+num+", Others = "+other);
		s.close();
	}

}
