package com.flp.ems.domain;

public class Employee {
	 private String Employee_Id;
		private String Name;
		private String Kin_Id;
		private String Email_Id;
		private String Phone_No;
		private String DOB;
		private String DOJ;
		private String Address;
		private String Department_Id;
		private String Project_Id;
		private String Roles_Id;
		
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getKin_Id() {
			return Kin_Id;
		}
		public void setKin_Id(String kin_Id) {
			Kin_Id = kin_Id;
		}
		public String getEmail_Id() {
			return Email_Id;
		}
		public void setEmail_Id(String email_Id) {
			Email_Id = email_Id;
		}
		public String getPhone_No() {
			return Phone_No;
		}
		public void setPhone_No(String phone_No) {
			Phone_No = phone_No;
		}
	
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		public String getDOJ() {
			return DOJ;
		}
		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getDepartment_Id() {
			return Department_Id;
		}
		public void setDepartment_Id(String department_Id) {
			Department_Id = department_Id;
		}
		public String getProject_Id() {
			return Project_Id;
		}
		public void setProject_Id(String project_Id) {
			Project_Id = project_Id;
		}
		public String getRoles_Id() {
			return Roles_Id;
		}
		public void setRoles_Id(String roles_Id) {
			Roles_Id = roles_Id;
		}
		@Override
		public String toString() {
			return "Employee [Name=" + Name + ", Email_Id=" + Email_Id + ", Phone_No=" + Phone_No + ", DOB=" + DOB
					+ ", DOJ=" + DOJ + "]";
		}
		
		
		
		
		

}
