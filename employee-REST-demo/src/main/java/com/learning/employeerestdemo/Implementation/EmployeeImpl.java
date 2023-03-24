package com.learning.employeerestdemo.Implementation;

import com.learning.employeerestdemo.Interface.EmployeeInterfaceDAO;
import com.learning.employeerestdemo.Model.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeImpl implements EmployeeInterfaceDAO {
    private EntityManager entityManager;

    @Autowired
    public EmployeeImpl(EntityManager ent) {
        this.entityManager = ent;
    }

    @Override
    public List<Employees> findAll() {
        TypedQuery<Employees> theQuery = entityManager.createQuery("From Employees", Employees.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Employees> findById(int id) {
        TypedQuery<Employees> theQuery = entityManager.createQuery("from Employees where id=:thedata", Employees.class);
        theQuery.setParameter("thedata", id);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void createEmployees(Employees emo) {
        entityManager.persist(emo);
    }
}
