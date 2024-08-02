package com.emp.emp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.emp.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
    
}
