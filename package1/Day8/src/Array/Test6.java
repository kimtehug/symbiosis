package Array;

import java.util.Scanner;
//WAP to accept array and search any no and replace it with another no:
public class Test6 {

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
		int rep;
	System.out.println("enter number that you want to replace");	
		int num=sc.nextInt();
		for(int i =0;i<b.length;i++) {
			if(b[i]==num) {
			System.out.println("enter the number you want to replace");
			rep=sc.nextInt();
			b[i]=rep;
			}
		}
		System.out.println("Updated array");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		
			}
		
		
	}

}
