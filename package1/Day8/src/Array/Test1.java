package Array;

import java.util.Scanner;

//WAP to accept 5 nos for an array and make addition of it
public class Test1 {

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
 
 for(int i =0;i<b.length;i++) {
	 sum=b[i]+sum;
 }
 System.out.println("Sum of All elements : "+sum);
	}

}
