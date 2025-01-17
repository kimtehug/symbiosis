package operator_operation;

import java.util.Scanner;

//WAP To accepet any number and Round it.
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int num = sc.nextInt();
		int org=num;
	int digit=num%10;
	if(digit<5)
	{
		num= num/10;
		int ans = num*10;
		System.out.println(ans);
				
	}
	if(digit>=5)
	{
		int n1= 10-digit;
		int val=num+n1;
		System.out.println(val);
				
	}
	
	}

}
