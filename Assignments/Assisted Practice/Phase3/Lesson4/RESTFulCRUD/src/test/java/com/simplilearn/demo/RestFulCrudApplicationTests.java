package com.simplilearn.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestFulCrudApplicationTests 
{

	@Autowired
	private UserService service;
	
	
	/*@Test
	public void addTest()
	{
		Assertions.assertNotNull(service.addUser(new User("Nithya","nithu@gmail.com","Mumbai")));
	}
	*/
	@Test
	 @Disabled
	public void getTest() {
		Assertions.assertEquals(6,service.getAllUser().size());
	}
	
	 //get by id
    @Test
    public void getByIDTest() {
             Assertions.assertEquals("raaj",service.getUserById(7).getName());
             
    }
	

}