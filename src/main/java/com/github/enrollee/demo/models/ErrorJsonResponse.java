package com.github.enrollee.demo.models;

public class ErrorJsonResponse {
	private String errorMessage;

	public ErrorJsonResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ErrorResponse [errorMessage=" + errorMessage + "]";
	}
}
