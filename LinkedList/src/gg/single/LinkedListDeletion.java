package gg.single;


public class LinkedListDeletion {


	public static void main(String args[]){
		Node head=new Node(1);
		for(int i=2;i<=10;i++){
			head=insertEnd(head,i);
		}
		head=insertEnd(head,33);
		head=insertEnd(head,34);
		head=insertEnd(head,35);

		head=deleteKey(head, 33);
		head=deleteAtIndex(head, 11);
		printAllNodes(head);
	}
	//Printing all the nodes given the head of the list 
	public static void printAllNodes(Node head){	
		if(head==null)
			return ;
		
		Node tr=head;
			while(tr!=null){
				System.out.println("Data "+ tr.data);
				tr=tr.next;
			}

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

	public static Node deleteKey(Node head, int data){
		if(head==null)
			return null;
		if(head.data==data)
			return head.next;
		
		Node temp=head;
		Node prev=temp;
		
		while(temp!=null&& temp.data!=data){
			prev=temp;
			temp=temp.next;
		}
		if(temp!=null)
		prev.next=temp.next;
		
		return head;
	}
	
	public static Node deleteAtIndex(Node head, int index){
		if(head==null)
			return null;
		if(index==0)
			return head.next;
		int count=0;
		Node temp=head;
		Node prev=temp;
		
		while(temp!=null&& count!=index){
			prev=temp;
			temp=temp.next;
			count++;
		}
		
		if(temp!=null)
		prev.next=temp.next;
		
		return head;
	}
}
