package gg.single;

public class LinkedListSortedMerge {
	

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
		
		//printAllNodes(head);
		//printAllNodes(head1);
		Node newHead=mergeSortedLinkedLists(head,head1);
		
		Node head12=new Node(1);
		head12=insertEnd(head12,12);
		head12=insertEnd(head12,2);
		head12=insertEnd(head12,8);
		head12=insertEnd(head12,122);
		head12=insertEnd(head12,52);
		head12=insertEnd(head12,6);
		
		printAllNodes(head12);
		sortLinkedLists(head12);
		printAllNodes(head12);

	}
	
	
	private static Node sortLinkedLists(Node head){
		Node n1=head;
		Node n2=head;
		if(n1.next==null){
			return n1;
		}
		Node prev=null;
		while(n1!=null && n2!=null&& n2.next!=null){
			prev=n1;
			n1=n1.next;
			n2=n2.next.next;
		}
		
		Node head2=prev.next;
		prev.next=null;

		head=sortLinkedLists(head);
		head2=sortLinkedLists(head2);
		
		Node newHead=mergeSortedLinkedLists(head, head2);
		
		return newHead;
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
