package com.iot.exception;

public class DeviceException extends Exception {
	
	private String errorCode = null;
	private String errorMsg = null;
	
	private static final long serialVersionUID = -243618874789103094L;

	/**
	 * @purpose Default Constructor
	 * 
	 */
	public DeviceException(){
		super();
	}
	
	/**
	 * @param msg
	 */
	public DeviceException(String msg) {
		super(msg);
	}
	
	public DeviceException(String errCode,String errString){
		this.errorCode=errCode;
		this.errorMsg=errString;
	}
	
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
