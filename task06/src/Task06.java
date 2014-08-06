import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOException;
public class Task06{
	private int numerator;
	private int denominator;

	public void Expression(){
		Scanner in = new Scanner(System.in);
		try{
			System.out.print("Numerator = ");
			int a = in.nextInt();
			numerator = a;
			System.out.print("Denominator = ");
			int b = in.nextInt();
			denominator = b;
			System.out.println( a + "/" + b + " = " + a/b);
		}
		catch(ArithmeticException e){ //chi bat loi toan hoc, khong bat loi input
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		try
		{
			Task06 x = new Task06();
			x.Expression();
		}
		catch(InputMismatchException e)
		{
			System.out.print("Input Erro!!!");
		}
	}
}
