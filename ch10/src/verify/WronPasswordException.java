package verify;

public class WronPasswordException extends Exception {
	public WronPasswordException() {
	}

	public WronPasswordException(String message) {
		super(message);
	}

}