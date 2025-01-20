package loop;

import java.util.Scanner;

//WAP to accept any no and check it is prime or not 
public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number ");
        int a = sc.nextInt();
        int flag=1;
        for(int i =2;i<a;i++)
        {
        	if(a%i==0) {
        	flag=0;	
        		}
        
        }
        
        if(flag==1) {
        	System.out.println("enterd number is prime");
        }
        else {
        	System.out.println("enterd number is Not  prime");
            
        	
        }
	}

}
