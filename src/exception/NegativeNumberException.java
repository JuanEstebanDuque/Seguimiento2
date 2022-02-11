package exception;

public class NegativeNumberException extends Exception{
	public NegativeNumberException() {
		super("No puede usar números negativos.");
	}
	
}
