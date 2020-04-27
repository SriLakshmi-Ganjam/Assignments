package com.capgemini.angularproject.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.angularproject.beans.ProductResponse;
import com.capgemini.angularproject.exceptions.ProductException;

@RestControllerAdvice
public class MyRestControllerAdvice {

	@ExceptionHandler
	public ProductResponse myExceptionHandler(ProductException empException) {
		ProductResponse response = new ProductResponse();
		response.setError(true);
		response.setMessage(empException.getMessage());
		return response;

	}

}
