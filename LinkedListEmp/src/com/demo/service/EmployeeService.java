package com.demo.service;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmp(int pos);

	void addEmpById(int id);

	void deleteEmp(int pos);

	void deleteById(int id);

	void displayById(int id);

	void displayBySal(double salary);

	void displayAll();

}
