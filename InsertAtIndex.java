package positionInsert;

import java.util.Scanner;

public class InsertAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n+1];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++) arr[i]=s.nextInt();
		System.out.print("Enter index at which to enter new value (index starts from 0): ");
		int ind = s.nextInt();
		System.out.print("Enter the value to insert: ");
		int val = s.nextInt();
		for(int i=n;i>=ind; i--)
			arr[i]=arr[i-1];
		arr[ind]=val;
		System.out.println("New array after insertion is: ");
		for(int ele:arr) System.out.print(ele+" ");
		s.close();
	}
}