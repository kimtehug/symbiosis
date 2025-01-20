package loop;
//WAP To Display all odd nos between 1-10 and make addition of it.
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =1,sum=0;
while(a<=10) {
	if(a%2==1) {
	sum=sum+a;
	System.out.println(a);
}
	a++;	
}		
System.out.println("Sum of All nos: "+sum);	
	}

}
