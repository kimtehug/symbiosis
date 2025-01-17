package operator_operation;
//WAP to solve quadratic equation
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ,b & c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+"x^2+"+b+"x+"+c+"0");
		//Calculate the discriminant
		int delta= (b*b)-4*a*c;
		double sqr=Math.sqrt(delta);
		double ans=(-b+sqr)/(2*a);
		double ans1=(-b-sqr)/(2*a);
		
		System.out.println("x="+ans+ " x="+ans1);
		
		
		
		
	}

}
