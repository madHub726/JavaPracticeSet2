package sumProdDigits;

import java.util.Scanner;

public class sumProd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int sum=0;
		int prod=1;
		while(num>0) {
			sum = sum+(num%10);
			prod = prod*(num%10);
			num = num/10;
		}
		System.out.println("Sum of digits is "+sum+" and Product of digits is "+prod);
		s.close();
	}
}
