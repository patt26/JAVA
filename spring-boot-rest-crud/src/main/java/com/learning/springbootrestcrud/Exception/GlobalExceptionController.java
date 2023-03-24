package com.learning.springbootrestcrud.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionController {

    // For specific student not found exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handler(StudentNotFoundException exce){
        StudentErrorResponse error=new StudentErrorResponse();
        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setMsg(exce.getMessage());
        error.setTime(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }

    // For global exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handle(Exception e){
        StudentErrorResponse error=new StudentErrorResponse();
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        error.setMsg(e.getMessage());  // <--if u want modify global message update here
        error.setTime(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
