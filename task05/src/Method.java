
public class Method{
	private int numerator;
	private int denominator;
	
	public Method(int a, int b){
		numerator = a;
		denominator = b;
	}
	public void someMethod() throws Exception{
		if(denominator == 0)
			throw new Exception();
		System.out.println( numerator + "/" + denominator);
	}
	public void someMethod2() throws Exception{
		someMethod();
		throw new Exception();
	}
	
	public static void main(String[] args){
	Method x = new Method(2, 0);
		try{
			x.someMethod2();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
