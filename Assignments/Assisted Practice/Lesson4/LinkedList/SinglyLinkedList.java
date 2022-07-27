package Lesson4LinkedList;


public class SinglyLinkedList {
	
	Node head; //first node
	
	//inner class
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	public static SinglyLinkedList insert(SinglyLinkedList list,int data) {
		
		
		Node new_node= new Node(data);     //create a node with given data
		new_node.next=null;
		
		
		if(list.head==null) {			 //if the linked list is empty, then make the new node as head
			list.head=new_node;		
		}
		
		else
		{
			
			Node last=list.head;
			while(last.next!=null) 
			{
				last =last.next;
			}
			
			//Insert the new_node at the last node
			last.next=new_node;
		}
		
		return list;
	}
	
	
	public static void printList(SinglyLinkedList list) {
		
		Node currNode= list.head;
		System.out.print("LinkedList: ");
	
		while(currNode!=null) {
			
			System.out.print(currNode.data +" ");		//print the data of current node
			
			//go to the next node
			
			currNode=currNode.next;
		}
		
		System.out.println();
	}
	
	//Method to delete a node in the LinkedList by KEY
		public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {
		
			Node currNode = list.head, prev = null;
			
			if (currNode != null && currNode.data == key) {
				list.head = currNode.next; // Changed head
				System.out.println(key + " found and deleted");
				return list;
			}


			while (currNode != null && currNode.data != key) {
				prev = currNode;
				currNode = currNode.next;
			} 
			if (currNode != null) {
				prev.next = currNode.next;
				System.out.println(key + " found and deleted");
			}
			
			if (currNode == null) {
				System.out.println(key + " not found");
			}
			return list;
		}


	public static void main(String[] args) {
		
		
		
		SinglyLinkedList list =new SinglyLinkedList();
		
	
		list= insert(list, 10);
		list= insert(list, 23);
		list= insert(list, 34);
		list= insert(list, 54);
		list= insert(list, 65);
		list= insert(list, 69);
		list= insert(list, 87);
		list= insert(list, 57);

		printList(list);

		deleteByKey(list, 1);
		printList(list);
		
		deleteByKey(list, 4);   // deleting key
		printList(list);
		
		deleteByKey(list, 10);
		printList(list);
		
	}

}
