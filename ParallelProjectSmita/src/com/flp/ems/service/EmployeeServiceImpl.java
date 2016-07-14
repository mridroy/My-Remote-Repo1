package com.flp.ems.service;

import java.util.HashMap;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;
import com.flp.ems.view.UserInteraction;

public class EmployeeServiceImpl implements IEmployeeService{
Employee e=new Employee();
boolean a,b,c;
EmployeeDaoImplForList el=new EmployeeDaoImplForList();


	@Override
	public void AddEmployee(HashMap hm) {
		// TODO Auto-generated method stub
		
		a=Validate.isvalidPhone((String) hm.get("Phone"));
		b=Validate.isvalidEmail((String) hm.get("Email_Id"));
		c=Validate.isvalidname((String) hm.get("Name"));
	
		
		if(a&&b&&c)
		{
			System.out.println("validity success");
			e.setName((String) hm.get("Name"));
			e.setKin_Id((String) hm.get("Kin_Id"));
			e.setPhone_No((String) hm.get("Phone"));
			e.setEmail_Id((String) hm.get("Email_Id"));
			e.setAddress((String) hm.get("Address"));
			e.setDOB((String) hm.get("Date of birth"));
			e.setDOJ((String) hm.get("Date of joining"));
			
		}
		else
		{
			System.out.println("validity failure");
		}
		/*e.setName((String) hm.get("Name"));
		//System.out.println(e.toString());
		e.setPhone_No((String) hm.get("Phone"));
		e.setEmail_Id((String) hm.get("Email_Id"));
		e.setDOB((String) hm.get("Date of birth"));
		e.setDOJ((String) hm.get("Date of joining"));
		System.out.println(e.toString());*/
		
		el.AddEmployee(e);
		
		
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
