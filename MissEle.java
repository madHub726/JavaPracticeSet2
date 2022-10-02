package missingElement;

import java.util.Scanner;

public class MissEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++) arr[i]=s.nextInt();
		int sum = ((arr.length+1)/2)*arr.length;
		for(int ele:arr) sum = sum-ele;
		System.out.println("Missing Element is: "+sum);
		s.close();
	}

}