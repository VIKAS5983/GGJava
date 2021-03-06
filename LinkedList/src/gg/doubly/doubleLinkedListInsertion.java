package gg.doubly;

public class doubleLinkedListInsertion {
	
	public static void main(String args[]){
		Node n=new Node(2);
		
		n=insertHead(n,3);
		n=insertHead(n,4);
		n=insertHead(n,5);
		n=insertHead(n,6);
		n=insertHead(n,8);
		n=insertTail(n,1);
		n=insertTail(n,0);
		n=insertTail(n,-1);
		n=insertAtIndex(n, 11, 0);
		n=insertAfterNode(n, 12, -1);
		n=insertBeforeNode(n, 123, 123);

		
		printDoubleLinkedList(n);
	}
	
	public static void printDoubleLinkedList(Node head){
		while(head!=null){
		System.out.print(" "+head.data);
		head=head.next;
		}
		System.out.println();
	}
	
	public static Node insertHead(Node head,int data){
		Node n=new Node(data);	
		if(head==null){
			return n;
		}
		
		n.next=head;
		head.prev=n;
		n.prev=null;
		return n;
	}
	
	public static Node insertTail(Node head,int data){
		Node n=new Node(data);	
		if(head==null){
			return n;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		n.prev=temp;
		temp.next=n;
		n.next=null;
		
		return head;
	}

	public static Node insertAtIndex(Node head,int data, int index){
		if(head==null || index==0){
			return insertHead(head,data);
		}
		
		int count =1;
		Node temp=head;
		while(temp.next!=null && count !=index){
			temp=temp.next;
			count++;
		}
		
		Node n=new Node(data);
		n.next=temp.next;
		if(temp.next!=null)
		temp.next.prev=n;
		temp.next=n;
		n.prev=temp;
		
		return head;
	}
	
	public static Node insertAfterNode(Node head,int data, int afterData){
		if(head==null){
			return insertHead(head,data);
		}
		
		Node temp=head;
		while(temp.next!=null && temp.data !=afterData){
			temp=temp.next;
			
		}
		
		Node n=new Node(data);
		n.next=temp.next;
		if(temp.next!=null)
		temp.next.prev=n;
		temp.next=n;
		n.prev=temp;
		
		return head;
	}
	
	public static Node insertBeforeNode(Node head,int data, int beforeData){
		if(head==null || head.data==beforeData){
			return insertHead(head,data);
		}
		
		Node temp=head;
		Node prev=null;
		while(temp.next!=null && temp.data !=beforeData){
			prev=temp;
			temp=temp.next;
			
		}
		
		if(temp.next==null){
			return head;
		}
		Node n=new Node(data);
		n.next=temp;
		prev.next=n;
		temp.prev=n;
		n.prev=prev;
		
		return head;
	}
}
