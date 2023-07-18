package com.blogapp.blog.exceptions;

public class ApiException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3065726077921406723L;
	public ApiException(String message) {
        super(message);
    }
    public ApiException() {
        super();
    }
}
