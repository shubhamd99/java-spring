package com.shubham.cms.api;

import com.shubham.cms.exception.ApplicationError;
import com.shubham.cms.exception.CustomerNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// @ControllerAdvice - A controller advice allows you to use exactly the same exception handling techniques but apply them across the whole application,
// not just to an individual controller.
// @RestController - The @RestController annotation is used to define the RESTFul web services. It serves JSON, XML and custom response.
@ControllerAdvice
@RestController
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @Value("${api_doc_url}")
    private String details;

    // The @ExceptionHandler annotated method is only active for that particular Controller, not globally for the entire application.
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ApplicationError> handleCutomerNotFoundException(CustomerNotFoundException exception, WebRequest webRequest) {
        ApplicationError applicationError = new ApplicationError();
        applicationError.setCode(101);
        applicationError.setMessage(exception.getMessage());
        applicationError.setDetails(details);

        // Response - { "code": 101, "message": "Customer Record is not available..." }, Status - 404 Not Found
        return new ResponseEntity<>(applicationError, HttpStatus.NOT_FOUND); // Passing the error object
    }
}
