/*
D C B A
C B A
B A
A
*/
package Patterns;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int a = 4; a >= 1; a--) {
	            char letter = (char) ('A' + a - 1); 
	            for (int b = a; b >= 1; b--) {
	                System.out.print(letter + " "); 
	                letter--; 
	                }
	            
	            System.out.println(); 
	        }
	}

}
