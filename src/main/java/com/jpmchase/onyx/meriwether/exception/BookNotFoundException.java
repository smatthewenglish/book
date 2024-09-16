package com.jpmchase.onyx.meriwether.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {
    
    //public BookNotFoundException(String message, Throwable cause) {
    public BookNotFoundException() {
        //super(message, cause);
        super("Book not found");
    }
}
