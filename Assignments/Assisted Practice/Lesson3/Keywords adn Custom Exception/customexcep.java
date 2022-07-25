package Lesson3Keywords;

	
	class customexcep extends Exception 
	{ 
	    public customexcep(String s) 
	    { 
	        super(s); 
	    } 
	} 
	class Cus
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new customexcep("temp"); 
	        } 
	        catch (customexcep ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}



