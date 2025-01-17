package day3;

import java.util.Scanner;

//WAP to accept 3 nos: & display the largest
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter values of A , B & C ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b&& a>c)
{
	System.out.println("A is greater B and C");
}
else if(b>a&& b>c) {
	System.out.println("B is greater A and C");
}
else {
	System.out.println("C is greater A and B");
}
	}

}
