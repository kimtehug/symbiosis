package day3;

import java.util.Scanner;

//WAP To accept no and check it is odd or even
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("even number ");
		}
		else {
			System.out.println("odds number ");
		}
		
		
		
	}

}
