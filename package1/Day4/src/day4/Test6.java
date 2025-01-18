package day4;

import java.util.Scanner;

//WAP To Calculate area of circle , triangle ,rectangle and Square
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" To Calculate Area enter choice 1.circle,2.Triangle ,3.Rectangle and 4.Square  ");
		int ch = sc.nextInt();

		switch(ch) {
		case 1:
			System.out.println("enter the radious of circle");
			int r = sc.nextInt();
			float f= 3.14f;
			float area = f*r*r;
			System.out.println("Area of circle"+ area);
			break;
			
		case 2:
			System.out.println("enter the base and heigth");
			int base  = sc.nextInt();
			int height  = sc.nextInt();
			float f1=0.5f;
			float area1 = (f1*base*height);
			System.out.println("Area of Triangle "+ area1);
			//
			break;
			
		case 3:
			System.out.println("enter the length and width");
			int length  = sc.nextInt();
			int width  = sc.nextInt();
			float area3 = (length *width);
			System.out.println("Area of Rectangle "+ area3);
			break;
			
		case 4:
			System.out.println("enter the side of Square");
			int side = sc.nextInt();
			
			float area4 = (side *side);
			System.out.println("Area of Rectangle "+ area4);
			break;
			
		
		
		default:
			System.out.println("Invalis Choice");
			
			
			
			
			
		}
	}

}
