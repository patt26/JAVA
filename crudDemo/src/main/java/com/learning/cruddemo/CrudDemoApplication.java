package com.learning.cruddemo;

import com.learning.cruddemo.DAO.IStudentDAO;
import com.learning.cruddemo.Entity.Student;
import com.learning.cruddemo.Implementation.StudentImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(IStudentDAO stud) {
        return runner -> {
//        createStudent(stud);
//        findByIDs(stud,2);
//        UpdateStudent(stud,3,"Elon");
//        getAllStudents(stud);
//        findByLastName(stud,"Jackson");
//        DeleteStudents(stud,3);
//        DeleteAllStudents(stud);
        LastEntry(stud);

        };
    }

    private void DeleteAllStudents(IStudentDAO stud) {
        System.out.println("Deleting All students...");
        int rowsDeleted = stud.deleteAll();
        System.out.println("Total Rows Deleted: " + rowsDeleted);


    }


    private void createStudent(IStudentDAO stud) {
        System.out.println("Creating student......");
        Student newStudent = new Student("Chris", "Jackson", "chrisJ@gmail.com");
        Student newStudent1 = new Student("Linda", "Hoffstader", "LindaHO@gmail.com");
        Student newStudent2 = new Student("Max", "Cruiser", "MaxC@yahoo.com");
        Student newStudent3 = new Student("Lana", "Kempler", "LaKemp@orkut.com");



        System.out.println("Saving Student.....");
        stud.Save(newStudent);
        stud.Save(newStudent1);
        stud.Save(newStudent2);
        stud.Save(newStudent3);


//        System.out.println("Student saved successfully.. Generated id: "+ newStudent.getId());

    }

    private void findByIDs(IStudentDAO stud, int index) {
        System.out.println("getting student... ");
        Student newStudent = stud.findById(index);
        System.out.println(newStudent);
    }

    private void getAllStudents(IStudentDAO studentDAO) {
        List<Student> tempStudent = studentDAO.findAll();
        for (Student x : tempStudent) {
            System.out.println(x);
        }
    }

    private void findByLastName(IStudentDAO iStudentDAO, String lastName) {
        List<Student> tempStudent = iStudentDAO.findByLastName(lastName);
        for (Student x : tempStudent) {
            System.out.println(x);
        }
    }

    private void UpdateStudent(IStudentDAO studentDAO, int id, String firstName) {
        Student newStudent = studentDAO.findById(id);
        newStudent.setFirstName(firstName);
        studentDAO.UpdateStudent(newStudent);
        System.out.println("Student updated.." + "\nUpdated Student: " + newStudent);
    }

    private void DeleteStudents(IStudentDAO studentDAO, int id) {
        Student student = studentDAO.findById(id);
        studentDAO.DeleteStudent(id);
        System.out.println(student + " deleted Successfully");
        getAllStudents(studentDAO);
    }

    private void LastEntry(IStudentDAO student){
        List<Integer> lastStudent=student.findLastEntry();
        for(Integer x:lastStudent){
            System.out.println(x);
        }
    }


}
