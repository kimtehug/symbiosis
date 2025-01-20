package loop;

import java.util.Scanner;

//WAP To accept any no and sum of it's all digit.
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a= sc.nextInt();
int sum=0;
while(a!=0) {
	int digit =a%10;
	sum=sum+digit;
	a=a/10;
}
System.out.println(sum);
}
}