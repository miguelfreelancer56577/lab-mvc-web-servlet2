package com.github.mangelt.storage.exception;

public class AppException extends RuntimeException{
	private static final long serialVersionUID = -2428273816753827545L;
	public AppException(String message, Throwable e) {
		super(message, e);
	}
}
