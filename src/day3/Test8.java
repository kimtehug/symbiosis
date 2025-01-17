package day3;

import java.util.Scanner;

//WAP to accept Subject s calculate total , and per & Display pass or fail
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks of subjects");
System.out.println("Marathi");
int a = sc.nextInt();
System.out.println("Maths");
int b = sc.nextInt();
System.out.println("English");
int c = sc.nextInt();
System.out.println("Hindi ");
int d = sc.nextInt();
System.out.println("Science");
int e = sc.nextInt();
int sum = a+b+c+d+e;
float per=sum/5;
System.out.println(" percentage: "+ per);
if(per>=35) {
	System.out.println(" pass");
}
else {
	System.out.println(" fail");
}

	}

}
