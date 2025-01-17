package package1;

class Class{ 
	static int p ,q;
	static void disply() {
		System.out.println("P: "+ p);
		System.out.println("Q: "+ q);
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.p=7566;
		Class.q=589;
		Class.disply();
		
		Test2.a=3;
		Test2.b=10;
		
	Test2.method();
		
	}

}
