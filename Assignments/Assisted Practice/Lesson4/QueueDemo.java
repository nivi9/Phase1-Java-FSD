package Lesson4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
		
		public static void main(String[] args) {
			Queue<String> NameQueue= new LinkedList<String>();
			
			NameQueue.add("Nivetha");
			NameQueue.add("Kamal");
			NameQueue.add("Rakesh");
			NameQueue.add("Poo");
			NameQueue.add("Yashu");
			NameQueue.add("Sharma");
			
			System.out.println("Queue is : "+NameQueue);
			
			
			//find head of queue
			System.out.println("Head of Queue: "+NameQueue.peek());
			
			NameQueue.remove();
			
			System.out.println("After Removing Head: "+NameQueue);
			
		}

	}

