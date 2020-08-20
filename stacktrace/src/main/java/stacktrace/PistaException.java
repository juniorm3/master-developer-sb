package stacktrace;

@SuppressWarnings("serial")
public class PistaException extends Exception {

	public PistaException(String message, AcimaVelocidadeMaximaException e) {
		super(message, e);
	}

}
