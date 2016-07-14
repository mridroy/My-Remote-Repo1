package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	static int opt;
	static Scanner s=new Scanner(System.in);
	static UserInteraction ui=new UserInteraction();
	
public static void main(String[] args) {
	
	
	System.out.println("Enter option \n 0.Add \n1.Modify \n2.Search  \n3Remove \n4. Exit");
	opt=s.nextInt();
	switch(opt)
	{
	case 0:
 
		ui.AddEmployee();
	break;	
		
	case 1:
		
		
	ui.ModifyEmployee();
	break;
	
	case 2:
		ui.SearchEmployee();
		break;
		

	case 3:
		ui.RemoveEmployee();
		break;
		
	case 4:
		System.exit(0);
		break;
		
	}
	
}
}
