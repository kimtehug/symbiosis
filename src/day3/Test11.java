package day3;

import java.util.Scanner;

//WAP To Accept purchase & Selling price & check that he has profit or Loss how much
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Purchase Price: ");
        double purchasePrice = sc.nextDouble();

        
        System.out.println("Enter the Selling Price: ");
        double sellingPrice = sc.nextDouble();

   
        if (sellingPrice > purchasePrice) {
            double profit = sellingPrice - purchasePrice;
            System.out.println("You made a profit of: " + profit);
        } else if (sellingPrice < purchasePrice) {
            double loss = purchasePrice - sellingPrice;
            System.out.println("You incurred a loss of: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
	}

}
