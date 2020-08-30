package com.github.enrollee.demo.models;

public class SuccessResponseMessage {
	private String message;

	public SuccessResponseMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SuccessResponseMessage [message=" + message + "]";
	}
}
