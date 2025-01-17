package package1;

import java.util.Scanner;

// WAP to accept sides of a triangle and calculate its area
public class Test11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

    if (a + b > c && b + c > a && c + a > b) {
            double s = (a + b + c) / 2; 

           double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of the Triangle: " + area);
        } else {
            System.out.println("The entered sides do not form a valid triangle.");
        }

     
    }
}
