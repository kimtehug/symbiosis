package Array;

import java.util.Scanner;

//WAP to accept 5 nos for an array and search any no is how many times present
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array");
int a = sc.nextInt();
int[] b = new int[a]; 
System.out.println("Enter array elements:");

for(int i =0;i<b.length;i++)
{
	b[i]=sc.nextInt();
}
System.out.println("given array elements");
for(int i =0;i<b.length;i++)
{
	System.out.println(b[i]);
}
	System.out.println("enter the element to find count ");
	int c = sc.nextInt();
	int flag =0;
	int val=1;
	int index=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]==c) {
			val=0;
			flag++;
			index=i;
	}
	}
	if(val==0) {
		System.out.println("element present "+ flag+" times");
	}
	else {
		System.out.println("Not found the element "+c);
		
	}
	}

}
