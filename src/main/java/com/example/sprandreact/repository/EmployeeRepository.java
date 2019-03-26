package com.example.sprandreact.repository;

import com.example.sprandreact.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
