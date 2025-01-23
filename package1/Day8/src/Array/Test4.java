package Array;

import java.util.Scanner;

//WAP to accept 5 nos for an array and display search any no is present or not.
public class Test4 {

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
	System.out.println("enter the element to find ");
	int c = sc.nextInt();
	int flag =1;
	int index=0;
	for(int i=0;i<b.length;i++) {
		if(b[i]==c) {
			flag=0;
			index=i;
	}
	}
	if(flag==0) {
		System.out.println("found the element at index "+index+ "element "+c);
	}
	else {
		System.out.println("Not found the element "+c);
		
	}
	}

}
