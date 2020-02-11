package myutil;

public class GetElementAtEmptyListException extends RuntimeException {
	
	public  GetElementAtEmptyListException() {
		super("Index bigger than list size");
	}

}
