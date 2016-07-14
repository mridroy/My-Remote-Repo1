package com.flp.ems.view;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {

Validate v=new Validate();

 private String Name;
private  String Kin_Id;
 private String Email_Id;
 private String Phone_No;
 private String DOB;
 private String DOJ;
 private String Address;
 boolean c,d,flag;
 
	
 

	Scanner sc=new Scanner(System.in);
	 HashMap<String,String> hm=new HashMap<String,String>();

	void AddEmployee() {
    
do
{
	System.out.println("Enter name");
	Name=sc.next();
	
	System.out.println("Enter Kin_Id");
	Kin_Id=sc.next();
	
	System.out.println("enter phone no");
	Phone_No=sc.next();
	
	System.out.println("Enter Email_Id");
	Email_Id=sc.next();
	
	System.out.println("Enter Address");
	Address=sc.next();
	
	System.out.println("Enter date of joining");
	DOJ=sc.next();
	
	System.out.println("Enter date of birth");
	DOB=sc.next();
	
	
	c=Validate.isThisDateValid(DOB,"dd/MM/yyyy");
	d=Validate.isThisDateValid(DOJ,"dd/MM/yyyy");
 
if(c&&d)
  {
	System.out.println("valid");  
	hm.put("Name",Name);
	hm.put("Kin_Id",Kin_Id);
	hm.put("Phone", Phone_No);
	hm.put("Email_Id",Email_Id);
	hm.put("Address",Address);
	hm.put("Date of birth",DOB);
	hm.put("Date of joining", DOJ);
	flag=true;
  }
  else
  {
	  System.out.println("invalid");
	  flag=false;
	  
  }
}while(flag!=true);
   
			
/*hm.put("Name",Name);
hm.put("Phone", Phone_No);
hm.put("Email_Id",Email_Id);
hm.put("Date of birth",DOB);
hm.put("Date of joining", DOJ);
System.out.println(hm);*/
EmployeeServiceImpl es=new EmployeeServiceImpl();
es.AddEmployee(hm);





			
			
			
			
		
	}

	

	void ModifyEmployee() {

	}

	void RemoveEmployee() {

	}

	void SearchEmployee() {

	}

	void getAllEmployee() {

	

	}
}
