package loop;

import java.util.Scanner;

//WAP to display fibonessies series no 
public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number ");
        int a = sc.nextInt();
        int b=0,temp = 0;
        int c=1;
        System.out.println(a+"\n" +b);
        for(int i=1;i<=a;i++ )
        {
        	temp=b+c;
        	b=c;
        	 System.out.println(temp);
        	c=temp;
        	
        }
       
        
	}

}
