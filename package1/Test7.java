package package1;

import java.util.Scanner;

public class Test7 {
void calculator() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of A:");
	int a = sc.nextInt();
	System.out.println("Enter value of A:");
	int b = sc.nextInt();
	System.out.println("Addition of A & B:- \n" + (a+b));
	System.out.println("Subtraction of A & B:- \n" + (a-b));
	System.out.println("Multiplication of A & B:- \n" + (a*b));
	System.out.println("Division of A & B:- \n" + (a/b));

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Test7 t7= new Test7();
t7.calculator();

	}

}
