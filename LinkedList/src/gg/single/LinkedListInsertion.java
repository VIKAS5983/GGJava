package gg.single;


public class LinkedListInsertion {


	public static void main(String args[]){
		Node head=new Node(1);
		
		for(int i=2;i<10;i++){
			head=insertEnd(head,i);
		}

		for(int i=30;i>23;i--){
			head=insertHead(head,i);
		}
			
		head=insertAtIndex(head, 123, 2);
		head=insertInAscendingOrder(head, 125);
		head=insertInAscendingOrder(head, 101);
		head=insertInDescendingOrder(head, 21);
		
		printAllNodes(head);
	}
	

	public static Node insertHead(Node head, int data){
		Node newHead=new Node (data);
		newHead.next=head;
		
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
	

	public static Node insertAtIndex(Node head,int data,int index){
		
		int count=2;
		if(head==null || index==1)
			{
				Node newHead=new Node(data);
				newHead.next=head;
				return newHead;
			}
		Node temp=head;
		
		while(temp.next!=null && count!=index){
			temp=temp.next;
			count++;
		}
		Node nextNode=temp.next;
		
		temp.next=new Node(data);
		temp.next.next=nextNode;
		
		return head;
	}

	public static Node insertInAscendingOrder(Node head,int data){
		
		if(head.data>=data)
		{
			Node newHead=new Node(data);
			newHead.next=head;	
			return newHead;
		}
		Node newNode=new Node(data);
		Node temp=head;
		Node prev=null;
		
		while(temp!=null && temp.data<data){
			prev=temp;
			temp=temp.next;
		}
		
		prev.next=newNode;
		newNode.next=temp;
		
		return head;
	}
	
	public static Node insertInDescendingOrder(Node head,int data){
		
		if(head.data<=data)
		{
			Node newHead=new Node(data);
			newHead.next=head;	
			return newHead;
		}
		Node newNode=new Node(data);
		Node temp=head;
		Node prev=null;
		
		while(temp!=null && temp.data>data){
			prev=temp;
			temp=temp.next;
		}
		
		prev.next=newNode;
		newNode.next=temp;
		
		return head;
	}

	//Printing all the nodes given the head of the list 
	public static void printAllNodes(Node head){	
		if(head==null)
			return ;
		
		Node tr=head;
		System.out.print("Data ");
			while(tr!=null){
				System.out.print(" "+ tr.data);
				tr=tr.next;
			}
		System.out.println();

	}

}
