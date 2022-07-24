package Lesson3Keywords;

public class Throwskey {

	
    void Division() throws ArithmeticException
    
    {
        int a=20,b=0,result;
        
        result = a / b;
        
        System.out.print("\n\tThe result is : " + result);
    }
    
     public static void main(String[] args)
    {
    	 Throwskey obj = new Throwskey();
         try
        {
        	 obj.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }
}


