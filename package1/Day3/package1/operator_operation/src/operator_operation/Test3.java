package operator_operation;

import java.util.Scanner;

//WAP to Acceept any Year in check it is leap year or not.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = sc.nextInt();
		if(year%4==0 && year%100!=0 || year % 400 == 0){
			System.out.println("Entered year is Leap Year");
		}
		else {
			System.out.println("Entered year is Leap Not Year");
				
		}
		
		
}}

