package ThreadsEx;

public class RunnableInterface implements Runnable {
	
	//implement run method
	
	public  void run() {
		
		for(int i=1; i<5; i++) {
			
			System.out.println(i+ " "+Thread.currentThread().getName());
		
			 try {
				Thread.sleep(1000);
			} 
			 catch (InterruptedException e)
			 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			 
	}
	
	public static void main(String[] args) {
		//create target of runnable interface
		
		RunnableInterface run1= new RunnableInterface();
		RunnableInterface run2= new RunnableInterface();
		
		//create threads  by passing runnable targets in constructor
		Thread t1=new  Thread(run1);
		Thread t2=new  Thread(run2);
		
		t1.setName("First");
		t2.setName("Second");
	
		t1.start();
		t2.start();
	}

}
