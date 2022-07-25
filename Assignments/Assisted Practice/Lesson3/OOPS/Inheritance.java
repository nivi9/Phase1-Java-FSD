package Lesson3OOPS;

 class Student {

	int reg_no;  
	
	void getNo(int no) 
	
	{  
		
	reg_no=no;
	
	}  
	void putNo()  
	
	{  
		
	System.out.println("registration number= " + reg_no);  
	
	}  
	}  
	//intermediate sub class  
	class Marks extends Student  
	
	{  
		
	float marks;  
	
	void getMarks(float m)     //getting marks
	
	{  
	marks=m;  
	}  
	
	void putMarks()  
	{  
	System.out.println("marks= "+marks);  
	}  
	}  
	
	//derived class 
	
	class Sports extends Marks  
	
	{  
		
	float score;  
	
	void getScore(float scr)     //getting score
	
	{  
	score=scr;  
	}  
	
	void putScore()  
	{  
	System.out.println("score= "+score);  
	}  
	} 
	
	public class Inheritance   
	{  
	public static void main(String args[])  
	
	{  
	Sports ob=new Sports();  
	
	ob.getNo(10);  
	ob.putNo();  
	ob.getMarks(78);  
	ob.putMarks();  
	ob.getScore(68.7f);  
	ob.putScore();  
	}  

}
