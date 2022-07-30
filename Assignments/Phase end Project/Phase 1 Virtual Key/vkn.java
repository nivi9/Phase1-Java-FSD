package vktrial;


import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class vkn {
	
	    	
	   public static void mainMenu()                                      // To Select the option in Main menu
	   {
	    	System.out.println("Please select one the following");
	        System.out.println("1 Retrieve current file names in ascending order ");
	        System.out.println("2 Business Level Operation Menu");
	        System.out.println("3 for exit application");
	    	
	    }
	   public static void fileOperations() {                             // File Operations
	    	
	    	System.out.println("Please choose one of the following options :");
	        System.out.println("1. Create a file");										
	        System.out.println("2. Delete a File from directory");      
	        System.out.println("3. Search for a File");					
	        System.out.println("4. for main menu");						
	        
	        Scanner sc=new Scanner(System.in);
	        
	    	try {
	    		
	    		
	            int choice=sc.nextInt();
	            
	             switch(choice)								// using switch case to select the file operation menu
	             {
	             case 1:
	                 System.out.println("You have selected to create file");
	                 createFile();                                     //Create a file	
	                 break;
	                 
	             case 2:
	                 System.out.println("You have selected to Delete file");
	                 deleteFile();									   //Delete a file
	                 break;
	                 
	             case 3:
	                 System.out.println("You have Selected to search file");
	                 searchFile();									   //Search for a file
	                 break;
	                 
	             case 4:
	                 System.out.println("Going back to MainMenu");
	                 vkn.mainMenu();								   // Going back to main menu
	                  break;
	         }

	        }
	    	catch(Exception e)
	    	{
	           System.out.println("Please Enter a valid number");
	           vkn.fileOperations();
	        }
	   }
	
	     public static void Ascending()                              // 1. current file names in ascending order 
	     {
	   	   
	    	   File f=new File("E:\\Assisted Code Simplilearn_javaFSD");
	    	   
	    	   File arr[]=f.listFiles();
	    	   
	    	   Arrays.sort(arr);									//To sort a file
	    	   
	    	   for(File k:arr)
	    	   {
	    		if(k.isFile()) 
	    		{
	    			System.out.println(k.getName());
	    		}
	    		else if (k.isDirectory()) 							//checking directory
	    		{
	    			System.out.println(k.getName());
	    		}
	    		
	            else
	            {
	              System.out.println(f.getAbsolutePath() + " is not a directory");
	            }
	    	  }
	          vkn.mainMenu();

	    }
	    	 public static void createFile() 						// Creating new file in the given folder
	    	 {

	           File file = new File("E:\\Assisted Code Simplilearn_javaFSD\\Lesson4");
	           
	           file.mkdir();
	           
	        
	       Scanner sc = new Scanner(System. in );    
	       System.out.println("Enter the file name : ");         // Getting file name from the user
	       
	       String name = sc.nextLine();                         //variable name to store the file name
	          
	       File files = new File("E:\\Assisted Code Simplilearn_javaFSD\\Lesson4"+name);   

	           try 
	           {
	               if (files.createNewFile()) {
	                   System.out.println("File Created! :)");
	                   vkn.fileOperations();
	               } else {
	                   System.out.println("File already exists :(");
	                   vkn.fileOperations();
	               }
	           } catch (Exception e) {
	               System.out.println(e);
	           }
	       }

	    	    public static void deleteFile() {  				// Delete a file from the mentioned directory
	    	        String filename;
	    	        Scanner input = new Scanner(System.in);

	    	        System.out.println("Enter the Name of File to Delete: ");
	    	        filename = input.nextLine();

	    	        File file= new File("E:\\Assisted Code Simplilearn_javaFSD\\Lesson4"+filename);

	    	        if (file.delete())                         // delete method is used to delete a file 
	    	        {
	    	            System.out.println("File deleted successfully");
	    	            vkn.fileOperations();
	    	        }
	    	        else 
	    	        {
	    	            System.out.println("Oops !! File not found.Please try again ");
	    	            vkn.fileOperations();
	    	        }

	    	    }
	    	    
	    	    public static void searchFile()               // Search a file from the mentioned directory
	    	    {
	    	        System.out.println("Enter the name of the file to Search");
	    	        
	    	        Scanner s1 = new Scanner(System.in);
	    	        String fName = s1.next();
	    	        File file = new File("E:\\Assisted Code Simplilearn_javaFSD\\Lesson4" + fName);

	    	        if (file.exists())                      // Checking the file using exists inbuilt method
	    	        {
	    	            System.out.println("File found!! :)"+"\n"+"This is the file location");
	    	            System.out.println(file.getAbsolutePath());
	    	            vkn.fileOperations();
	    	        } 
	    	        else
	    	        {
	    	            System.out.println("Sorry, File Not Found :(");
	    	            vkn.fileOperations();
	    	        }
	    	    }
	    	    
	    	    
	  public static void main(String[] args)                       //Main method
	  {

	    	            System.out.println("**************************");
	    	            System.out.println("Welcome to Virtual Key ");
	    	            System.out.println("Developer : NivethaKamal");
	    	          
	    	            System.out.println("**************************");
	    	            
	    	     Scanner sc=new Scanner(System.in);
	    	     vkn.mainMenu();
	    	     
	    	            while(true) 
	    	            {
	    	                
	    	                  try {
	    	            	
	    	                  int option=sc.nextInt();
	    	                  
	    	                  switch(option) {
	    	                    case 1 :
	    	                        System.out.println("These are the files in ascending");
	    	                        Ascending();
	    	                        break;
	    	                    case 2 :
	    	                    	vkn.fileOperations();
	    	                    	break;
	    	                        
	    	                    case 3 :
	    	                	   System.out.println(" Thanks for using VirtualKey Locker ");
	    	                       System.out.println("Application closed");
	    	                       System.exit(option);
	    	                        break;
	    	                        
	    	                    default:
	    	                        System.out.println("Please enter the valid number");
	    	                        break;

	    	                }
	    	            }
	    	                    catch(Exception e){
	    	                    	System.out.println("Please Enter valid number");
	    	                    	vkn.main(args);
	    	         }
	    	    }
	    	    
	   

}
}