package com.smartsearch.search.exception;

public class BOException extends Exception{
	
	private String errorCode;
	private String errorMessage; 
	
	public BOException(){
		super();
	}

	public BOException(String errorCode, String message){
		super(errorCode + ":"+ message);
		this.errorCode = errorCode;
		this.errorMessage = message;
	}
	
	public BOException(String errorCode, String message, Throwable t){
		super(errorCode + ":"+ message, t);
		this.errorCode = errorCode;
		this.errorMessage = message;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
