package com.naresh.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.modal.Employee;
import com.naresh.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController 
{
	@Autowired
	private EmployeeRepository repo;
	
	@PostMapping("/save")
	public ResponseEntity<Object> createEmployee(@Valid @RequestBody Employee employee,Errors errors)
	{
		Object response=null;
		if(errors.hasErrors())
		{
			response=errors.getAllErrors();
			return ResponseEntity.badRequest().body(response);
		}
		else
		{
			employee=repo.save(employee);
			response="Saved with:"+employee.getEmpId();
			return ResponseEntity.ok(response);
		}
		
	}
	@GetMapping("/get/{empId}")
	public ResponseEntity<Object> getEmployee(@PathVariable Long empId)
	{
		Object response=null;
		Optional<Employee> emp=repo.findById(empId);
		if(emp==null)
		{
			response="Employee("+empId+")Not found";
		}
		else {
			response=emp;
		}
		return ResponseEntity.ok(response);
			
	}
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable Long empId)
	{
		Object response=null;
		Optional<Employee> emp=repo.findById(empId);
		if(emp==null)
		{
			response="Employee("+empId+")Not found";
		}
		else {
			repo.deleteById(empId);
			response="Employee("+empId+")Deleted";
		}
		return ResponseEntity.ok(response);
			
	}
	/*@PutMapping("/update/{empId}")
	public ResponseEntity<Object> updateEmployee(@PathVariable Long empId,@Valid @RequestBody Employee employee, Errors errors)
	{
		Object response=null;
		if(errors.hasErrors())
		{
			response=errors.getAllErrors();
			return ResponseEntity.badRequest().body(response);
		}
		Employee emp=repo.find
		if(emp==null)
		{
			response="Employee("+empId+")Not found";
		}
		else
		{
			emp.setEmpName(employee.getEmpName());
		}
			
		return null;
	}
	*/
    @GetMapping("/all")
	public ResponseEntity<Object> getAllEmployee(){
		Object response=null;
		Iterable<Employee> emps=repo.findAll();
		if(emps==null||emps.toString().equals("[]"))
		{
			response="Employess not found";
		}
		else
		{
			response=emps;
		}
		return ResponseEntity.ok(response);
		
	}

}
