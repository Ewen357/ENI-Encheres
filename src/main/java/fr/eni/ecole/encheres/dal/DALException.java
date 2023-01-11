package fr.eni.ecole.encheres.dal;

public class DALException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DALException() {
		super();
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	public DALException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DALException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DALException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DALException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
