/*
A B C D
A B C
A B 
A
*/
package Patterns;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 0; 
for(int a=1;a<=4;a++) {
	letter = 'A';
	for(int b=a;b<=4;b++) {
	
		
		System.out.print(letter);
		letter++;
	}
	
	System.out.println();
}
	}

}
