/*
A
A B
A B C
A B C D
*/
package Patterns;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 0; 
for(int a=1;a<=4;a++) {
	letter = 'A';
	for(int b=1;b<=a;b++) {
	
		
		System.out.print(letter);
		letter++;
	}
	
	System.out.println();
}
	}

}
