package day3;

import java.util.Scanner;

//WAP To accept any character & check it is Vowel or Consonent.
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch = sc.next().charAt(0);
		if(ch =='a'  || ch =='e' || ch =='i' || ch =='o'  || ch =='u' || ch =='A'  || ch =='E' || ch =='I' || ch =='O'  || ch =='U') {
			System.out.println("charater is Alphabet ");
		}
		if(ch >='0' && ch <='9')	{
			System.out.println("charater is vowel ");
		}
		else {
			System.out.println("charater is Consonent ");
		}
		
		
		
	}

}
