package package1;

import java.util.Scanner;

//WAP accept temperature centigrade and convert it into fahrenheit
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("Enter temperature into farenheight");
float c = sc.nextFloat();
float f= (9.0f/5);
float f1=f*c;

System.out.println((f1)+32);

	}

}
