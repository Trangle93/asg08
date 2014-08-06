import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
public class Task03 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.print("Numerator: ");
			int numerator = scanner.nextInt();
			System.out.print("Denominator: ");
			int denominator = scanner.nextInt();
			int result = numerator/denominator;
			System.out.println("Result: " + result );
		}
		catch(InputMismatchException e)
		{
			System.out.print("Input Erro!!!");
		}
		catch(ArithmeticException e)
		{
			System.out.print("Arithmetic Erro!!!");
		}
		catch(Exception e)
		{
			System.out.print("Erro!!!");
		}

	}

}
