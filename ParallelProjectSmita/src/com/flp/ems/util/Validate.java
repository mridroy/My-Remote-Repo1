package com.flp.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.flp.ems.domain.Employee;

public class Validate {



	public static   boolean isvalidname(String name)	{
		

	if(name.matches("")) return false;
	
	
	
	else  return true;
		
	}

	static boolean isvalidkin() {

		return true;

	}

		public static boolean isvalidPhone(String phone) {

		isInt(phone);

		if (phone.equals("")) return false;
		 else if (phone.length() > 10) return false;
			 else if (phone.length() < 10) return false;
				 else return true;

	

	}
	

	public static boolean isInt(String phones) {

		try {
			long i = Long.parseLong(phones);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static boolean isvalidEmail(String mail) {
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
		java.util.regex.Matcher m = p.matcher(mail);
		return m.matches();

	}
	
	
public static boolean isThisDateValid(String dateToValidate, String dateFromat){
		
		if(dateToValidate == null){
			return false;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFromat);
		sdf.setLenient(false);
		
		try {
			
			//if not valid, it will throw ParseException
			Date date = sdf.parse(dateToValidate);
			System.out.println(date);
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	
	
	
	
}
