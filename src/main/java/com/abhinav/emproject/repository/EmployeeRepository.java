package com.abhinav.emproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhinav.emproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    // all crud database methods
    
} 
