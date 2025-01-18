package day4;
//WAP To Accept any character and display it like A- A for Apple, B - B for bat  so on 
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Character");
char ch = sc.next().charAt(0);
switch(ch) {
case 'a':
	System.out.println("Apple");
	break;
	
case 'A':
	System.out.println("Apple");
	break;
	
case 'b':
	System.out.println("Bat");
	break;
	
case 'B':
	System.out.println("Bat");
	break;
case 'c':
	System.out.println("Cat");
	break;
	
case 'C':
	System.out.println("Cat");
	break;
	
case 'd':
	System.out.println("Dog");
	break;
	
case 'D':
	System.out.println("Dog");
	break;
	
default:
	System.out.println("You Enter another button ");
	
	
}

	}

}
