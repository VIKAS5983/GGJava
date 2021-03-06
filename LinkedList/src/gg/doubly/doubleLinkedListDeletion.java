package gg.doubly;

public class doubleLinkedListDeletion {
	
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
		
		int data =111;//11,12 -1 Edge cases 
		System.out.println("Deleting the Node " + data);
		
		n=deleteNode(n, data);
		doubleLinkedListInsertion.printDoubleLinkedList(n);

	}
	
	
	public static Node deleteNode(Node head, int data){
		
		if(head.data==data)
		{
			head.next.prev=null;
			return head.next;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null && temp.data!=data){
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return head;
		
		prev.next=temp.next;
		if(temp.next!=null)
		temp.next.prev=prev;
		
		return head;
	}
	
	
	
	
	
	

}
