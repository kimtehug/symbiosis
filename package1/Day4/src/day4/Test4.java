package day4;

import java.util.Scanner;

//WAP To Accept To numbers 2 nos perform operations 1.Additon , 2.Subtraction,3.Multiplication , 4 Division
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter choice to perform operation");
		System.out.println("1.Additon , 2.Subtraction , 3.Multiplication , 4 Division");
		int ch = sc.nextInt();
		switch(ch) {
		case '1':
			System.out.println(a+b);
			break;
			
		case '2':
			System.out.println(a+b);
			break;
			
		case '3':
			System.out.println(a+b);
			break;
			
		case '4':
			System.out.println(a+b);
			break;
			
		
		
		default:
			System.out.println("Invalis Choice");
			
			
			
			
			
		}
	}

}
