package Sort0;

import java.util.Scanner;

public class move0ToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++) arr[i]=s.nextInt();
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
//				System.out.println(arr[i]);
				cnt++;
				for(int j=i;j<n-1;j++) arr[j]=arr[j+1];
				System.out.println();
			}
		}
		for(int i=0;i<=cnt;i++) arr[n-i-1]=0;
		System.out.println("After swapping the array is: ");
		for(int ele: arr) System.out.print(ele+" ");
	}

}