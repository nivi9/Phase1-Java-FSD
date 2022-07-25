package Lesson3OOPS;

 class Encap {
	
    private String Name; 
    private int Age;
    private String gender; 
    
    
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public String getGender()  
    { 
       return gender; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setGender( String newGender)  
    { 
      gender = newGender; 
    } 
}
public class Encapsulation 
{     
    public static void main (String[] args)  
    { 
        Encap obj = new Encap(); 
        obj.setName("Nivethakamal"); 
        obj.setAge(23); 
        obj.setGender("Female"); 
        System.out.println("My name:  " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My Geender: " + obj.getGender());      
    } 
}


