package loop;

import java.util.Scanner;

//WAP To accept any no and Reverse it.
public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a= sc.nextInt();
int sum=0;
while(a!=0) {
	int digit =a%10;
	sum=sum*10+digit;
	a=a/10;
}
System.out.println(sum);
}
}