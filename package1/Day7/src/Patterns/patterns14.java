package Patterns;
/*
 1 2 3 4
  1 2 3
   1 2
    1

        */
public class patterns14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for (int a = 4; a >= 1; a--) {
	            // Inner loop to print leading spaces
	            for (int b = 4; b > a; b--) {
	                System.out.print(" ");
	            }

	            // Inner loop to print numbers
	            for (int c = 1; c <= a; c++) {
	                System.out.print(" " + c);
	            }

	            // Move to the next line after each row
	            System.out.println();
}
	}

}
