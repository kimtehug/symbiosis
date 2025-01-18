package day4;
//WAP To check largest number using Conditional_operator
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a = sc.nextInt();
int b = sc.nextInt();
String s = (a>b)?("A is largest number"):("B is largest number");
System.out.println(s);
	}

}
