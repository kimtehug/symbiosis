package forloop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,p=1,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Binary number");
a=sc.nextInt();
while(a>0) {
	
	b=a%10;
	sum=sum=+b*p;
	a=a/10;
	p=p*2;
}
System.out.println("Decimal no: "+sum);




	}
}
