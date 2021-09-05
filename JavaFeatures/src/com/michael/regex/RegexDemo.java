package com.michael.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static boolean isMobileNumber(String mobileNum) {
		Pattern reg = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher matcher = reg.matcher(mobileNum);
		return matcher.matches();
	}
	
	public static boolean isValidName(String name) {
		Pattern reg = Pattern.compile("([A-Za-z]+\\s?)+");
		Matcher matcher = reg.matcher(name.trim());
		return matcher.matches();
	}
	
	public static boolean isValidEmail(String email) {
		Pattern reg = Pattern.compile("[A-Za-z][A-Za-z0-9_.]*[@]\\w+[.][A-Za-z]{3}");
		Matcher matcher = reg.matcher(email.trim());
		return matcher.matches();
	}
	
	public static void main(String[] args) {
		String phoneNum = "111-222-3333";
		String name = "Tony Stark";
		String email = "TonyStark@gmail.com";
		System.out.println(phoneNum + " is a phone number: " + isMobileNumber(phoneNum));
		System.out.println(name + " is a valid name: " + isValidName(name));
		System.out.println(email + " is a valid email: " + isValidEmail(email));
	}

}
