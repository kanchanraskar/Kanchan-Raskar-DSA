package com.demo.linkedlist;

import com.demo.beans.Employee;

public class LinkedList {

	Node head;
	
	class Node
	{
		Employee e;
		Node next;
		
		public Node()
		{
			e=null;
			next=null;
		}
		
		public Node(Employee e)
		{
			this.e=e;
			next=null;
		}
	}
	
	public boolean addNode(Employee e,int pos)
	{
		if(head==null)
		{
			System.out.println("list is empty we are adding node at first pos");
			Node newnode=new Node(e);
			head=newnode;
		}
		else {
			Node newNode=new Node(e);
			if(pos==1)
			{
				newNode.next=head;
				head=newNode;
				
			}else {
				
				Node temp=head;
				for(int i=1;temp!=null && i<pos-1;i++)
				{
					temp=temp.next;
				
				}
				if(temp!=null)
				{
					newNode.next=temp.next;
				
					temp.next=newNode;
					
				}
				
			}
		}
		return true;
	}
	
	public void deleteNode(int pos)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			if(pos==1)
			{
				Node temp=head;
				head=head.next;
				temp.next=null;
				temp=null;
			}else {
				Node temp=head;
				Node prev=null;
				for(int i=0;temp!=null && i<pos-1;i++)
				{
					 prev=temp;
					temp=temp.next;
				}	
					
						
						prev.next=temp.next;
						temp.next=null;
						temp=null;
						System.out.println("deleted successfully");
					
				
			}
		}
		
		
	}
	
	
	public void addById(Employee e,int id)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else {
			Node newNode=new Node(e);
			
			Node temp=head;
			while(temp.e.getEid()!=id && temp.next!=null)
			{
				temp=temp.next;
			}
			if(temp.next!=null) {
				newNode.next=temp.next;
				temp=newNode;
			}
			
			System.out.println("added successfully");
		}
	}
	
	public void deleteById(int id)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}else {
			
			Node temp=head;
			if(head.e.getEid()==id)
			{
				head=head.next;
				temp.next=null;
				temp=null;
			}
			else {
				temp=head;
				Node prev=null;
				while( temp!=null && temp.e.getEid()!=id)
				{
				 prev=temp;
					temp=temp.next;
					
				}
				
					if(temp.next!=null)
					{
						prev.next=temp.next;
						temp.next=null;
						temp=null;
					}
				
				System.out.println("deleted successfully: "+temp);
			}
		}
	}
	
	public void displayAll()
	{
		Node temp=head;
		for(;temp!=null;temp=temp.next) {
			System.out.println(temp.e+",");
		}
		
		System.out.println("\n-------------------------------\n");
	}
	
	public void displayById(int id)
	{
		if(head==null)
		{
			System.out.println("list is empty");
		}
		else
		{
			if(head.e.getEid()==id) {
			
				System.out.println("employee is"+head.e);
			}
			else {
				Node temp=head;
				while(temp.e.getEid()!=id)
				{
					temp=temp.next;
				}
				System.out.println("employee is:"+temp.e);
			}
		}
	}
	
	public void displayBySal(double sal)
	{
		if(head==null)
		{
			System.out.println("head is empty");
		}
		else {
			Node temp=head;
			while(temp.e.getSalary()>sal)
			{
				System.out.println("employee is:"+temp.e);
				temp=temp.next;
			}
		}
	}
	
}









