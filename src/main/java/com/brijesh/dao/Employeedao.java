package com.brijesh.dao;
import com.brijesh.model.Employee;
import java.util.*;

public interface Employeedao {
	public String getWorkingArea(int empId);
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployee();
	
}
