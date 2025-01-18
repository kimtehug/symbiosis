package day4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//Calculate  age of candidate 
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter you birthday date");
String s = sc.next()
;
LocalDate bdate = LocalDate.parse(s);
LocalDate ldate = LocalDate.now();

	Period p =Period.between(bdate, ldate);
int y=p.getYears();
int m=p.getMonths();
int d=p.getDays();
System.out.println("Years: "+y +" Months: "+m+"Days:  "+d);


	}

}
