package pairsSum;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++) arr[i]=s.nextInt();
		System.out.print("Enter sum to find: ");
		int sum=s.nextInt();
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if((arr[i]+arr[j])==sum && (i!=j))
					System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
		s.close();
	}

}
