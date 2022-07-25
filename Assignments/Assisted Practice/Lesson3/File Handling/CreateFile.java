package Lesson3FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class CreateFile {
	public static void createFileUsingFileClass() throws IOException
	{
		//create file
		File file= new File("E:\\Assisted Code Simplilearn_javaFSD\\Filehandling\\testFile25-07-22.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		writer.write(".....Welcome....!");
		writer.close();
		
		
	}
}
