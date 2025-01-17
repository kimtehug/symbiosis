package day3;

import java.util.Scanner;

//WAP to accept 2 nos: & display the largest
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter values of A & B numbers:");
int a = sc.nextInt();
int b = sc.nextInt();
if(a>b)
{
	System.out.println("A is greater");
}
else {
	System.out.println("B is greater");
}
	}

}
