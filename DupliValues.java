package arrayDuplicates;

import java.util.Scanner;

public class DupliValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
		s.close();
	}

}
