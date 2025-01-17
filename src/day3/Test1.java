package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InputStreamReader ir = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(ir);
System.out.println("enter any name");
String s ;
try {
	s=br.readLine();
	System.out.println("enter any character");
	char ch =(char)br.read();
	System.out.println("character is:"+ch);
}
catch(IOException e)
{
	e.printStackTrace();
}
	}

}
