package com.smartsearch.dao.jdbc.impl;
/**
 * 
 * @author prasadprabhakaran
 *
 */
public class DAOException extends Exception{
	
	public static final String UNEXPECTED = "DB0001";
	public static final String NOT_AUTHORIZED = "DB0002";
	public static final String NOT_EXIST = "DB0003";
	public static final String SQL = "DB0004";
	public static final String ILLIGALARG = "DB0004";
	
	private String errorCode;
	private String errorMessage; 
	
	public DAOException(){
		super();
	}

	public DAOException(String errorCode, String message){
		super(errorCode + ":"+ message);
		this.errorCode = errorCode;
		this.errorMessage = message;
	}
	
	public DAOException(String errorCode, String message, Throwable t){
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
