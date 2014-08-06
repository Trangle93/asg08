import java.util.Scanner;
public class Test {
	public static void main (String args [])
	{

		try{
			throw new ExceptionB();
		}
		catch(ExceptionA a){
			a.printStackTrace();
		}
		try{
			throw new ExceptionC();
		}
		catch(ExceptionB b){
			b.printStackTrace();
		}
	}
}
