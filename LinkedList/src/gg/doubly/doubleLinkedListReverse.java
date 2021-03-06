package gg.doubly;

public class doubleLinkedListReverse {

	public static void main(String args[]){
		Node n=new Node(2);
		
		n=doubleLinkedListInsertion.insertHead(n,3);
		n=doubleLinkedListInsertion.insertHead(n,4);
		n=doubleLinkedListInsertion.insertHead(n,5);
		n=doubleLinkedListInsertion.insertHead(n,6);
		n=doubleLinkedListInsertion.insertHead(n,8);
		n=doubleLinkedListInsertion.insertTail(n,1);
		n=doubleLinkedListInsertion.insertTail(n,0);
		n=doubleLinkedListInsertion.insertTail(n,-1);
		n=doubleLinkedListInsertion.insertAtIndex(n, 11, 0);
		n=doubleLinkedListInsertion.insertAfterNode(n, 12, -1);
		n=doubleLinkedListInsertion.insertBeforeNode(n, 123, 123);
		doubleLinkedListInsertion.printDoubleLinkedList(n);
		n=reverseLinkedList(n);
		System.out.println("Reverse a linked list: ");
		doubleLinkedListInsertion.printDoubleLinkedList(n);

	}
	
	public static Node reverseLinkedList(Node head){

		Node temp=head;
		Node prevHead=null;
		while(temp!=null){
		Node prev=temp.prev;
		Node nex=temp.next;
		prevHead=temp;
		Node nextTemp=temp.next;
		
		temp.next=prev;
		temp.prev=nex;
		temp=nextTemp;
		}
		
		return prevHead;
	}
}
