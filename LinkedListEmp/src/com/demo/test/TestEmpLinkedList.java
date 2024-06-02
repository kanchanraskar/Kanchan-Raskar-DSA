package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmpLinkedList {

	public static void main(String[] args) {
			
		EmployeeService eservice=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			
			System.out.println("1.add emp \n2.add employee after which value \n3. delete emp \n4 :delete emp by id \n 5.display by id \n6. display by salary");
			System.out.println("7.display all \n8.exit");
			
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("enter position:");
				int pos=sc.nextInt();
				boolean status=eservice.addEmp(pos);
				
				if(status)
				{
					System.out.println("added successfully");
				}
				else {
					System.out.println("error occured not added");
				}
				break;
				
			case 2:
				System.out.println("enter id after you want to add your Employee details");
				int id=sc.nextInt();
				eservice.addEmpById(id);
				break;
				
			case 3:
				System.out.println("enter position:");
				pos=sc.nextInt();
				eservice.deleteEmp(pos);
				
				
				break;
			
			case 4:
				System.out.println("enter employee id  you want delete ");
				id=sc.nextInt();
				
				eservice.deleteById(id);
				break;
			
			case 5:
				System.out.println("enter employee id for you want see details: ");
				id=sc.nextInt();
				
				eservice.displayById(id);
				
				break;
			
			case 6:
				System.out.println("enter employee salary to see employee who have greater salary than given salary:");
				double salary=sc.nextDouble();
			
				eservice.displayBySal(salary);
				break;
			
			case 7:
				System.out.println("all employees are:");
				eservice.displayAll();
				break;
			
			case 8:
				sc.close();
				System.out.println("thank you for visiting!!");
				break;
				
			default:
				System.out.println("enter valid choice");
			}
		}while(choice!=8);

	}

}
