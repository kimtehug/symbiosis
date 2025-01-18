package day4;

import java.util.Scanner;

//WAP To accept any number and check 1.Odd/Even 2.positive or -ve 3.Divisible by 3
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int a = sc.nextInt();
	int ch = 1;
		if(a%2==0)
		{
			ch=1;
		}
		else {
			ch=2;
		}
		if(a>0)
		{
			ch=3;
		}
		else if(a<0)
		{
			ch=4;
		}
		if(a%3==0)
		{
			ch=5;
		}
	
	
		switch(ch) {
		case 1:
			System.out.println("Even number");
			break;
			
		case 2:
			System.out.println("Odd number");
			break;
			
		case 3:
			System.out.println("Positive number");
			break;
			
		case 4:
			System.out.println("Negative number");
			break;
			
		case 5:
			System.out.println("Divisible by 3  number");
			break;
			
		
		default:
			System.out.println("Invalis input given");
			
			
			
			
			
		}
		
	}

}
