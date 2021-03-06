package gg.single;


public class linkedlistSwapAndReversal {


	public static void main(String args[]){
		Node head=new Node(1);
		head=insertEnd(head,2);
		head=insertEnd(head,3);
		head=insertEnd(head,4);
		head=insertEnd(head,5);

		head=swapTwoNodes(head,1,4);
		head=reverseLinkedList(head);
		
		printAllNodes(head);
	}
	
	
	public  static Node reverseLinkedList(Node head) {
		
		if(head==null){
			return null;
		}

		Node prev=null;
		Node temp=head;
		
		while(temp!=null){
			Node temp1=temp.next;
			temp.next=prev;
			prev=temp;
			temp=temp1;
		}
		
		return prev;
	}


	private static Node swapTwoNodes(Node head, int i, int j) {
		
		int count=0;
		Node n1=null;
		Node prevn1=null;
		Node n2=null;
		Node prevn2=null;
		Node temp=head;
		Node prev=head;
		
		while(temp!=null){
			prev=temp;
			temp=temp.next;
			count++;
			if(count==i){
				prevn1=prev;
				n1=temp;
			}
			if(count==j){
				prevn2=prev;
				n2=temp;
			}
		}
		
		prevn1.next=n2;
		Node tr=n2.next;
		n2.next=n1.next;
		prevn2.next=n1;
		n1.next=tr;
		
		return head;
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
