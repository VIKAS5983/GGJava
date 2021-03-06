package gg.circular;

import gg.single.LinkedListInsertion;
import gg.single.Node;

public class circularLinkedListSplitHalf {
	
	public static void main(String args[]){
		Node head=null;
		
		head=circularLinkedListInsertion.insertdata(head, 1);
		head=circularLinkedListInsertion.insertdata(head, 2);
		head=circularLinkedListInsertion.insertdata(head, 3);
		head=circularLinkedListInsertion.insertdata(head, 6);
		head=circularLinkedListInsertion.insertdata(head, 8);
		head=circularLinkedListInsertion.insertdata(head, 10);
		head=circularLinkedListInsertion.insertdata(head, 42);
		
		head=insertdata(head, 123);
		
		circularLinkedListInsertion.printData(head);
	//	splitCircularLinkedList(head);
	}
	
	// Insert the data in sorted manner	
	public static Node insertdata(Node head,int d){
		Node n=new Node(d);
		Node temp=head;
		Node prev=null;

		if(head==null){
			n.next=n;
			return n;
		}else if(head.data>d){
			do{
				prev=temp;
				temp=temp.next;
			}while(temp.next!=head);

			temp.next=n;
			n.next=head;
			head=n;
			return head;
		}		

		do{
			prev=temp;
			temp=temp.next;
		}while(temp.next!=head && temp.data< d);
		
		if(temp.next==head){
			prev=temp;
		}
			Node dtemp=prev.next;
			prev.next=n;
			n.next=dtemp;
		
		
		return head;
	}

	//Split Circular Linked list into two halfs
	public static void splitCircularLinkedList(Node head){
		
		Node slow=head;
		Node fast=head;
		
		do{
			slow=slow.next;
			fast=fast.next.next;
		}while(fast.next!=head && fast.next.next!=head);
		
		Node h1=slow.next;
		Node h2=head;

		slow.next=null;
		if(fast.next==head)
			fast.next=null;
		else 
			fast.next.next=null;
		
		LinkedListInsertion.printAllNodes(h1);
		LinkedListInsertion.printAllNodes(h2);
	}
	

}
