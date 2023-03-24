package com.learning.cruddemo.DAO;

import com.learning.cruddemo.Entity.Student;

import java.util.List;

public interface IStudentDAO  {
    void Save(Student stud);
    Student findById(Integer index);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void UpdateStudent(Student student);

    void DeleteStudent(int id);

    int deleteAll();

    List<Integer> findLastEntry();


}
