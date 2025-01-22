package Patterns;
/*
   * * * *
    * * * 
     * * 
      * 
*/
public class patterns24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 4; a >= 1; a--) {
          
            for (int b = 4; b > a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
	}

}
