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
    public Employees findById(int id) {
      /*  TypedQuery<Employees> theQuery = entityManager.createQuery("from Employees where id=:thedata", Employees.class);
        theQuery.setParameter("thedata", id);
        return theQuery.getResultList();*/

        Employees dbEmployee=entityManager.find(Employees.class,id);
        return dbEmployee;
    }

    @Override
    public Employees createEmployees(Employees emo) {
//      return entityManager.persist(emo);
        Employees dbEmployees=entityManager.merge(emo);
        return dbEmployees;
    }

    @Override
    public void deleteByID(int id) {
        Employees db=entityManager.find(Employees.class,id);
        entityManager.remove(db);
    }

    @Override
    // Update is remaining
    public Employees updateById(Employees emp, int id) {
        Employees db=entityManager.find(emp.getClass(),id);
//        db.setEmail(db.getEmail());
//        db.setFirstName(db.getFirstName());
//        db.setLastName(db.getLastName());
//        db.setId(id);
        return  entityManager.merge(db);
    }
}
