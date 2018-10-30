package gg.single;

public class LinkedList {
	
	static class Node{
		int data;
 		Node next;
 		Node(int d){
 			data=d;
 			next=null;
 		}
	}
	
	Node head;
	
	
	public static void main(String args[]){
		LinkedList list=new LinkedList();
		list.head=new Node(1);
		
		Node n2=new Node(2);
		Node n3=new Node(3);
		
		list.head.next=n2;
		n2.next=n3;
		n3.next=null;
		printAllNodes(list);
	}
	
	//Printing all the nodes of a linked list 
	public static void printAllNodes(LinkedList list){	
		if(list==null)
			return ;
		
		Node tr=list.head;
			while(tr!=null){
				System.out.println("Data "+ tr.data);
				tr=tr.next;
			}

	}
}