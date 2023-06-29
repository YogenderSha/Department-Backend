package com.dailyCodeBuffer.Spring.boot.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyCodeBuffer.Spring.boot.tutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {



	public Optional<Department> findDepartmentBydeptName(String deptName);



}
