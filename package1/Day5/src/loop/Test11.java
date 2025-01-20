package loop;

import java.util.Scanner;

//WAP To accept any no and Check it is Armstrong  153=
public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a= sc.nextInt();
double tot=0;
int temp=a;
int original=a;
double cube=0;
int digit=0;
while(original!=0) {
	int rem= original%10;
	digit++;
	original=original/10;
}
while(temp!=0) {
	int rem = temp%10;
	tot= tot+Math.pow(rem, digit);
	temp = temp/10;
}
if(tot==a) {
	System.out.println("Armstrong ");
}
else {
	System.out.println(" Not Armstrong ");
}


}
}