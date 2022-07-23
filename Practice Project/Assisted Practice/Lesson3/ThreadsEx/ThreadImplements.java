package ThreadsEx;


	
public class ThreadImplements extends Thread {
		
		//method over loading
		public void run() {
			System.out.println("thread Started");
		}
		
		public static void main(String[] args) {
			
			ThreadImplements t1= new ThreadImplements();
			ThreadImplements t2= new  ThreadImplements();
			
			t1.start();
			t2.start();
		}

	}



