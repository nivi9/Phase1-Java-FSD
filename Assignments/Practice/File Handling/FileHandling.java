	
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class FileHandling {
			
			public static void createWriteAppendfile() throws IOException
			{
				//Create New File
				
		    File file=new File("E:\\Assisted Code Simplilearn_javaFSD\\Files.txt");
		    
		    if(file.createNewFile())
		    {
		    	System.out.println("File is created");
		    }
		    else
		    {
		    	System.out.println("File is already exist");
		    }
		    
		    
		    
		    // Write the data to the file
		    
		    FileWriter obj=new FileWriter(file,false);
		    obj.write(" WRITE FILE--> Hey, Hiii");
		    obj.close();
		    
		  //Append text to the files
			
		  	 FileWriter writer=new FileWriter(file,true);
		  	    writer.write("\nAPPEND FILE--> This is appended text");
		  	    writer.close();
		    
		    
			}
			
		    // Read data to the files
			
		    public static void readFileReaderClass() throws IOException
		    {
		    	
		    	//Object Creation
		    FileReader obj1=new FileReader("E:\\\\Assisted Code Simplilearn_javaFSD\\\\Files.txt");
		  
		    int data;
		    
		    while((data=obj1.read())!=-1)
		    {
		    	System.out.print((char)data);
		    }
		    
			}
		    
			

		public static void main(String[] args) 
		{
	         try 
	         {
				createWriteAppendfile();
				System.out.println("READ FILE--> Your file is successfully read ");
				readFileReaderClass();
	         }
			 
	         catch (IOException e)
	         {
			    System.out.println("File Not Available");
				e.printStackTrace();
			 }
	         
		}

	}


