package day3;

import java.util.Scanner;

//WAP To Accept any electricity unit and calculate light bill.
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner sc =new Scanner(System.in);
        System.out.println("Enter electricity unit ");
        float units = sc.nextInt();
        float billAmount;
        if (units <= 50) {
            billAmount = (units * 1.50f); // Rate for first 50 units
        } else if (units <= 150) {
            billAmount = (50 * 1.50f) + ((units - 50) * 2.50f); // Next 100 units
        } else if (units <= 250) {
            billAmount = (50 * 1.50f) + (100 * 2.50f) + ((units - 150f) * 4.00f); // Next 100 units
        } else {
            billAmount = (50 * 1.50f) + (100 * 2.50f) + (100 * 4.00f) + ((units - 250) * 6.00f); // Above 250 units
        } 
        System.out.println("Your electricity bill is: " + billAmount);
      
	}

}