package Array;

import java.util.Arrays;
//WAP to accpet array and sort it in assending order
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int a = sc.nextInt();
		int[] b = new int[a]; 
		System.out.println("Enter array elements:");

		for(int i =0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("given array elements");
		for(int i =0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

		System.out.println("Assending order");
Arrays.sort(b);
for(int y : b) {
	System.out.println(y);
	
	
}

	}

}
