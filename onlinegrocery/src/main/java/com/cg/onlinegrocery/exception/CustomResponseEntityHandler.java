package com.cg.onlinegrocery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
	@RestController
	public class CustomResponseEntityHandler extends ResponseEntityExceptionHandler {
		@ExceptionHandler
		public ResponseEntity<Object> handleOrderIdException(OrderIdException ex, WebRequest request){
			OrderIdExceptionResponse orderIdExceptionResponse =  new OrderIdExceptionResponse(ex.getMessage());
			return new ResponseEntity<Object>(orderIdExceptionResponse,HttpStatus.BAD_REQUEST);
		}	
		
		@ExceptionHandler
		public ResponseEntity<Object> handleOrderNotFoundException(OrderNotFoundException ex, WebRequest request){
			OrderNotFoundExceptionResponse orderNotFoundExceptionResponse =  new OrderNotFoundExceptionResponse(ex.getMessage());
			return new ResponseEntity<Object>(orderNotFoundExceptionResponse,HttpStatus.BAD_REQUEST);
		}
		
	}

