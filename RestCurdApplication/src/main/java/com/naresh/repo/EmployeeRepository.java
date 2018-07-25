package com.naresh.repo;

import org.springframework.data.repository.CrudRepository;

import com.naresh.modal.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>
{


}
