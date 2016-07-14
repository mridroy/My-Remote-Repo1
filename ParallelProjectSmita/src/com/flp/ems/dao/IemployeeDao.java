package com.flp.ems.dao;

import java.util.List;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {

	
	
	
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void AddEmployee(Employee e);
	
}
