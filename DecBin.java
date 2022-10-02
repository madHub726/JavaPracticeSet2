package decimalToBinary;

import java.util.Scanner;

public class DecBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the decimal number: ");
		int num = s.nextInt();
		int[] temp = new int[100];
		StringBuilder binary = new StringBuilder();
		int tem = num;
		int i;
		for(i=0; tem>0; i++) {
			temp[i] = tem%2;
			tem = tem/2;
		}
		for(int j=i-1;j>=0;j--) binary.append(temp[j]);
		System.out.println(num+" in binary is "+binary);
		s.close();
	}

}
