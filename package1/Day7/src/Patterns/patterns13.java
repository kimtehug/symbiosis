package Patterns;
/*
   1
  1 2
 1 2 3
1 2 3 4  	

        */
public class patterns13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
