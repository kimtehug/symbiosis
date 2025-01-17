package day3;

import java.util.Scanner;

//WAP To accept no and check it is Positive or Negative
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("positive  number ");
		}
		if(a==0)
		{
			System.out.println("Origins number ");
		}
		else {
			System.out.println("Negative number ");
		}
		
		
		
	}

}
