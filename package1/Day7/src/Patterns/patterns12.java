package Patterns;
/*
1234  
 123
  12
   1
*/
public class patterns12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int a=1;a<=4;a++) {
	for(int b=1;b<a;b++) {
		
		System.out.print(" ");
	
	}
	for(int c =1;c<=5-a;c++) {
		System.out.print(c);
	}
System.out.println();
}
	}

}
