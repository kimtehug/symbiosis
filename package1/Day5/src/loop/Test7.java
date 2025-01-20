package loop;

import java.util.Scanner;

//WAP To accept any no and calculate factorial of it .
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a= sc.nextInt();
int fact=1;
System.out.println();
for(int i = 1;i<=a;i++) {
	fact=fact*i;
	
}
System.out.println(fact);
}
}