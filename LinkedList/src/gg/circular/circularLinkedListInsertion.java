package gg.circular;

import gg.single.Node;

public class circularLinkedListInsertion {

	public static void main(String args[]){
		Node head=null;
		
		head=insertdata(head, 1);
		head=insertdata(head, 2);
		head=insertdata(head, 3);
		head=insertdata(head, 4);

		printData(head);
		
	}
	
	
	public static Node insertdata(Node head,int d){
		Node n=new Node(d);

		if(head==null){
			n.next=n;
			return n;
		}
		Node temp=head;
		do{
			temp=temp.next;
		}while(temp.next!=head);
		
		temp.next=n;
		n.next=head;
		
		return head;
	}
	
	public static void printData(Node head){
		Node temp=head;
		System.out.println();
		do{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
		
	}
}
