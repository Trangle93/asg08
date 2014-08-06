import java.io.IOException;
public class task02{
	public static void main(String[] args){
		try{
			throw new ExceptionA();
		}
		catch(Exception A){
			A.printStackTrace();
		}
			
		try{
			throw new ExceptionB();
		}
		catch(Exception B){
			B.printStackTrace();
		}
			
		try{
			throw new NullPointerException();
		}
		catch(Exception C){
			C.printStackTrace();
		}
			
		try{
			throw new IOException();
		}
		catch(IOException D){
			D.printStackTrace();
		}
	}		
}
