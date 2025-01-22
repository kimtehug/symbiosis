/*
A
B A
C B A 
D C B A
*/
package Patterns;

public class pattern16 {

    public static void main(String[] args) {
        // Outer loop for rows
        for (int a = 1; a <= 4; a++) {
            char letter1 = (char) ('A' + a - 1); 
            for (int b = a; b >= 1; b--) {
                System.out.print(letter1 + " "); 
                letter1--; 
                }
            
            System.out.println(); 
        }
    }
}
