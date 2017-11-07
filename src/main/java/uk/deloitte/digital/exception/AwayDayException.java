package uk.deloitte.digital.exception;

/**
 * Custom exception to handle away day exceptions
 * 
 * @author Carlos Lopez
 *
 */
public class AwayDayException extends Exception {

	private static final long serialVersionUID = -8064375427647152246L;

	public AwayDayException(String message) {
		super(message);
	}

}
