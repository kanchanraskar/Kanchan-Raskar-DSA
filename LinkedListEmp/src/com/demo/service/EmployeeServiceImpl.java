package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.linkedlist.LinkedList;

public class EmployeeServiceImpl implements EmployeeService {

	LinkedList lst=new LinkedList();
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean addEmp(int pos) {
		
		System.out.println("enter emp id:");
		int id=sc.nextInt();
		
		
		System.out.println("enter emp name");
		String name=sc.next();
		
		System.out.println("enter salary:");
		double sal=sc.nextDouble();
		
		Employee e=new Employee(id,name,sal);
		
		return lst.addNode(e, pos);
	}
	
	
	@Override
	public void addEmpById(int id) {
		
		System.out.println("enter emp id:");
		int eid=sc.nextInt();
		
		
		System.out.println("enter emp name");
		String name=sc.next();
		
		System.out.println("enter salary:");
		double sal=sc.nextDouble();
		
		Employee e=new Employee(id,name,sal);
		
		lst.addById(e, eid);
	}


	@Override
	public void deleteEmp(int pos) {
		
		lst.deleteNode(pos);
	}


	@Override
	public void deleteById(int id) {
		 lst.deleteById(id);
		
	}


	@Override
	public void displayById(int id) {
		lst.displayById(id);
		
	}


	@Override
	public void displayBySal(double salary) {
		
		lst.displayBySal(salary);
		
	}


	@Override
	public void displayAll() {
		
		lst.displayAll();
		
	}

}
