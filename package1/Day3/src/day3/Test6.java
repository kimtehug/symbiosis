package day3;

import java.util.Scanner;

//WAP To accept any character & check it is Alphabet or digit or Special Character .
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch = sc.next().charAt(0);
		if(ch >='a'  || ch <='z' || ch >='A' || ch <='Z') {
			System.out.println("charater is Alphabet ");
		}
		if(ch >='0' && ch <='9')	{
			System.out.println("charater is number ");
		}
		else {
			System.out.println("Special Character ");
		}
		
		
		
	}

}
