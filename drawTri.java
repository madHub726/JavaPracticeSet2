package numTri123;

import java.util.Scanner;

public class drawTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows to print: ");
		int rows = s.nextInt();
		StringBuilder str = new StringBuilder();
		for(int i=1;i<=rows;i++) {
			str.append(i);
			System.out.println(str);
		}
		s.close();
	}

}
