package Lesson2;


public class InnerEx 
{
void Check(String locker_key)
{
		
		
		if(locker_key.equals("nivethakamal99@gmail.com")) {
			
			class Inner {
				
				
				void validate() {
					System.out.println("User Found and Authenticated");
				}
				
				
			}
			
			Inner inner= new Inner();
			inner.validate();


		}
		else {
			
			System.out.println("Not Valid");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		InnerEx outer= new InnerEx();
		outer.Check("nivethakamal99@gmail.com");
		
		
	}
}


