package com.learning.springbootrestcrud.Controller;

import com.learning.springbootrestcrud.Exception.StudentErrorResponse;
import com.learning.springbootrestcrud.Exception.StudentNotFoundException;
import com.learning.springbootrestcrud.Model.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController extends Exception {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student(1, "Jhon", "Levi"));
        students.add(new Student(2, "Van", "Kilmer"));
        students.add(new Student(3, "Mario", "Rossi"));
        students.add(new Student(4, "Charles", "Benitoly"));
        students.add(new Student(5, "Sergio", "Sainz"));
        students.add(new Student(6, "James", "Franklin"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) throws StudentNotFoundException {
        if(id>students.size()||id<0) {
            throw new StudentNotFoundException("Student id not found- "+id);
        }
        return students.get(id - 1);
    }

   /* // For specific student not found exception
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
    }*/
}
