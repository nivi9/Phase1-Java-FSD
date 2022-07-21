package Lesson2;

import java.util.regex.*;
import java.util.regex.Matcher;

public class RegularEx {

	public static void main(String[] args) {
		String regex="^(?=.*[A-Z]).{8,}";     // using Regular expression
		 
		String value="Nivethakamal9912334#$";
		
		Pattern pattern= Pattern.compile(regex);   //Create instance of matcher 
		
		Matcher match= pattern.matcher(value);
		
		if (match.matches()) {
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
}


