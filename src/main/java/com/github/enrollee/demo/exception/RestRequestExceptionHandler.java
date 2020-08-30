package com.github.enrollee.demo.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.github.enrollee.demo.models.ErrorJsonResponse;

@ControllerAdvice
public class RestRequestExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return generateErrorResponse(generateErrorMessage(ex.getMessage()), status);
	}
	
	private static ErrorJsonResponse generateErrorMessage(String errorMessage) {
		return new ErrorJsonResponse(errorMessage);
	}
	
	private static <T> ResponseEntity<T> generateErrorResponse(T entity, HttpStatus status) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<>(entity, headers, status);
	}
 
}
