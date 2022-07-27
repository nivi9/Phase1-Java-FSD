package Lesson4;


public class StackDemo {


		static final int MAX=1000;
		int  top;
		int a[]= new int[MAX];
		
		boolean isEmpty() {
			
			return top<0;
			
		}
		
		public StackDemo() {
			//constructor
			top=-1;
		}
		
		//add an element to stack
		boolean push(int x) {
			if(top>=(MAX-1)) {
				System.out.println("Stackis Overflow");
				return false;
			}
			else {
				a[++top]=x;
				System.out.println(x+" Pushed into stack");
				return true;
			}
		}
		
		//deletion of  elements

		int pop() {
			
			if(top<0) {
				System.out.println("Statck  is UNDERFLOW");
				return 0;
			}
			else {
				int x= a[top--];
				return x;
			}
			
		}
		
		public static void main(String[] args) {
			StackDemo s=  new StackDemo();
			s.push(123);
			s.push(124);
			s.push(789);
			s.push(34);
			
			System.out.println(s.pop()+ " : Poped Out from stack");
		}
	}


