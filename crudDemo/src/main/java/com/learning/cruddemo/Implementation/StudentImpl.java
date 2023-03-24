package com.learning.cruddemo.Implementation;

import com.learning.cruddemo.DAO.IStudentDAO;
import com.learning.cruddemo.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hibernate.sql.ast.Clause.*;

@Repository
public class StudentImpl implements IStudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentImpl(EntityManager en){
        entityManager=en;
    }


    @Override
    @Transactional
    public void Save(Student stud) {
        entityManager.persist(stud);
    }

    @Override
    public Student findById(Integer index) {
        return entityManager.find(Student.class,index);

    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student" ,Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> tempStudent=entityManager.createQuery("FROM Student WHERE lastName=:theData"  ,Student.class);
        tempStudent.setParameter("theData",lastName);
        return tempStudent.getResultList();
    }

    @Override
    @Transactional
    public void UpdateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void DeleteStudent(int id) {
        Student newStudent=entityManager.find(Student.class,id);
        entityManager.remove(newStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int noOfRowsDeleted=entityManager.createQuery("DELETE  FROM Student").executeUpdate();
        return noOfRowsDeleted;
    }

    @Override
    public List<Integer> findLastEntry() {
        TypedQuery<Integer> lastEntry=entityManager.createQuery("Select id FROM Student  Order By id desc",Integer.class);
        lastEntry.setMaxResults(2);
        return lastEntry.getResultList();
    }


}
