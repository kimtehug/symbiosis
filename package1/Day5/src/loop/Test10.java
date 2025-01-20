package loop;

import java.util.Scanner;

//WAP To accept any no and Check it Palindrom or not 
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number");
int a= sc.nextInt();
int palin=a;
int sum=0;
while(a!=0) {
	int digit =a%10;
	sum=sum*10+digit;
	a=a/10;
}

if(sum==palin) {
	System.out.println("enetred number is palindron");
}
else {
	System.out.println("enetred number is Not palindron");

}


}
}