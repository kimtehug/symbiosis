package Array;

import java.util.Scanner;

//WAP to accept 5 nos for an array and display its largest value
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 array elements:");
int sum=0;
int[] b = new int[5]; 
for (int i = 0; i < b.length; i++) {
    b[i] = sc.nextInt();
}


System.out.println("The array elements are:");
for (int i = 0; i < b.length; i++) {
    System.out.println(b[i]);
}
int max=0;
for (int i = 0; i < b.length; i++) {
	max= b[i];
	if(b[i]>max) {
		max=b[i];
	}
	
}
System.out.println("maximum value: "+ max);
 
	}

}
