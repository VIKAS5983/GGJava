package gg.single;

import gg.single.linkedlistSwapAndReversal.Node;

public class LinkedListSortedMerge {
	static class Node{
		int data;
 		Node next;
 		Node(int d){
 			data=d;
 			next=null;
 		}
	}
	public static void main(String args[]){
		Node head=new Node(1);
		head=insertEnd(head,3);
		head=insertEnd(head,5);
		head=insertEnd(head,9);
		head=insertEnd(head,12);

		Node head1=new Node(2);
		head1=insertEnd(head1, 6);
		head1=insertEnd(head1,7);
		head1=insertEnd(head1,10);
		head1=insertEnd(head1,15);
		
		printAllNodes(head);
		printAllNodes(head1);
		Node newHead=mergeSortedLinkedLists(head,head1);
		
		printAllNodes(newHead);
	}
	
	private static Node mergeSortedLinkedLists(Node head, Node head1) {
		Node newHead=null;
		Node temp=null;	
		boolean value=false;
			while(head!=null && head1!=null){
				if(head.data>head1.data) {
					if(!value){
					newHead=head1;
					temp=head1;
					value=true;
					}else{
						temp.next=head1;
						temp=temp.next;

					}
					System.out.println(head1.data);
					head1=head1.next;
				}else{
					if(!value){
					newHead=head;
					temp=head;
					value=true;
					}else{
						temp.next=head;
						temp=temp.next;

					}
					System.out.println(head.data);
					head=head.next;
				}
			}
			if(head==null)
				temp.next=head1;
			else
				temp.next=head;
		return newHead;
	}

	public static Node  insertEnd(Node head,int value){
		if(head==null)
			return new Node(value);
		Node temp=head;
		Node prev=null;
		while(temp!=null){
			prev=temp;
			temp=temp.next;
		}
		prev.next=new Node(value);
		return head;
	}

	//Printing all the nodes given the head of the list 
	public static void printAllNodes(Node head){	
		if(head==null)
			return ;
		Node tr=head;
		System.out.print("Data  ");
			while(tr!=null){
				System.out.print("  "+ tr.data);
				tr=tr.next;
			}
			System.out.println();
	}


}
