package com.shubham.cms.exception;

// Custom Exception
public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message) {
        super(message); // The super() in Java is a reference variable that is used to refer parent class constructors.
    }
}
