import java.util.Scanner;
import java.io.IOException;
public class Task04{
	private String name;
	private int ages;
	
	public Task04 (String s, int x) throws SomeException{
		if( x < 0)
			throw new SomeException();
		name = s;
	}
	public void print(){
		System.out.println("Name: " + name + " \tAges: " + ages );
	}
		
	public static void main(String[] args){
		try{
			Task04 x = new Task04("Hang", -5);
			x.print();
		}
		catch(SomeException e){
			System.out.print("Salary Error!\n");
		}
	}
}
