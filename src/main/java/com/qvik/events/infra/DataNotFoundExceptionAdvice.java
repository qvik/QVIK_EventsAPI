package com.qvik.events.infra;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DataNotFoundExceptionAdvice {

	@ResponseBody
	@ExceptionHandler(DataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	HashMap<String, Object> dataNotFoundHandler(DataNotFoundException ex) {
		HashMap <String, Object> error = new HashMap<>();
		error.put("code", 404);
		error.put("message", ex.getMessage());		
		return error;
	}
	
}
