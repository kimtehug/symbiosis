package day4;
//WAP To accept 3 nos and check largest number using Conditional_operator
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String s = (a>b && a>c)?("A is Greater "): 
		        (b>c && b>a)?("B is Greater"):
		        ("C is Greater");
	System.out.println(s);
	
		
		
	}

}
