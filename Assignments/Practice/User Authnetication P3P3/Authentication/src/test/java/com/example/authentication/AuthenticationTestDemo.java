package com.example.authentication;

import static org.junit.jupiter.api.Assertions.*;

	import org.junit.jupiter.api.Test;
	import org.junit.jupiter.api.Assertions.*;

import com.example.authentication.UserAuthentication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

	class AuthenticationTestDemo {
		
		private UserAuthentication obj;
		@BeforeEach
		public void setup() {
			obj= new UserAuthentication();
			System.out.println("User Initiated");
		}
		
		@AfterEach
		public void tearDown() {
			obj=null;
			System.out.println("User Closed");
		}
		
		@Test
		public void testUsingStrictRegex() {
		    String emailAddress = "nivethakamal@gmail.com";
		    String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		    assertTrue(UserAuthentication.patternMatches(emailAddress, regexPattern));
		    
		    
		    //Assert Null for Email   
		    emailAddress=null;
			 assertNull(emailAddress);
			 
			//Assert Not Null for Email   
			 emailAddress="nivethakamal@gmail.com";
			 assertNotNull(emailAddress);
		}	
		
		@Test
		public void testUsingPasswordStrictRegex() {
		    String passwordMat = "Nivesha99@";
		    String regexPatterns = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
		    assertTrue(UserAuthentication.passwordMatches(passwordMat, regexPatterns));
		    
		    //Assert Null for Password   
		     passwordMat=null;
			 assertNull(passwordMat);
			 
			//Assert Not Null for Password    
			  passwordMat="Nivesha99@";
			 assertNotNull(passwordMat);
			 
			 
			 
		    
		    
		}	
		
	
	}