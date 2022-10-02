package pascalTriangle;

import java.util.Scanner;

public class PascalTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of rows to print: ");
		int rows = s.nextInt();
		int c=1;
		for(int i=0;i<rows;i++) {
	        for(int blk=1;blk<=rows-i;blk++)
	        System.out.print(" ");
	        for(int j=0;j<=i;j++) {
	            if (j==0||i==0) c=1;
	            else c=c*(i-j+1)/j;
	            System.out.print(" "+c);
	        }
	        System.out.print("\n");
	    }
		s.close();
	}

}
