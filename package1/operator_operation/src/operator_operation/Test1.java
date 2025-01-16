package operator_operation;
//WAP to accept any amount display it's denomination
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter amount");
int amount = sc.nextInt();

System.out.println("2000 = "+ (amount/2000));
amount = amount%2000;

System.out.println("500 = "+ (amount/500));
amount = amount%500;

System.out.println("100 = "+ (amount/100));
amount = amount%100;

System.out.println("50 = "+ (amount/50));
amount = amount%50;
System.out.println("10 = "+ (amount/10));
amount = amount%10;

System.out.println("5 = "+ (amount/5));
amount = amount%50;

System.out.println("10 = "+ (amount/2));
amount = amount%2;


	}

}
