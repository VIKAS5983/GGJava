package gg.single;

import java.util.Hashtable;
import java.util.LinkedList;

import javax.swing.text.DefaultEditorKit.CutAction;

public class LinkedListReverseInGroups {
	public static void main(String args[]){
		Node head=new Node(1);
		for(int i=2;i<10;i++)
			head=LinkedListInsertion.insertEnd(head,i);

        head.next.next.next.next.next = head.next.next; 

		/*
		head=LinkedListInsertion.insertEnd(head,9);
		head=LinkedListInsertion.insertEnd(head,12);
		head=LinkedListInsertion.insertEnd(head, 6);
		head=LinkedListInsertion.insertEnd(head,7);
		head=LinkedListInsertion.insertEnd(head,10);
		head=LinkedListInsertion.insertEnd(head,15);
		head=LinkedListInsertion.insertEnd(head,12);
		head=LinkedListInsertion.insertEnd(head,2);
		head=LinkedListInsertion.insertEnd(head,8);
		head=LinkedListInsertion.insertEnd(head,122);
		head=LinkedListInsertion.insertEnd(head,52);
		head=LinkedListInsertion.insertEnd(head,6);
	*/
		System.out.println("Does loop exists in the linked list " + isLoopLinkedList(head));
		
		//removeLoopFromLinkedList(head);
		Node n1=new Node(1);
		n1=LinkedListInsertion.insertEnd(n1,9);
		n1=LinkedListInsertion.insertEnd(n1,1);
		n1=LinkedListInsertion.insertEnd(n1,1);
		n1=LinkedListInsertion.insertEnd(n1,5);
		Node n2=new Node(9);
		n2=LinkedListInsertion.insertEnd(n2,3);
		n2=LinkedListInsertion.insertEnd(n2,1);
		LinkedListInsertion.printAllNodes(n1);
		LinkedListInsertion.printAllNodes(n2);

		Node sum=addTwoLinkedLists(n1, n2);
		System.out.println("Sum: of ");
		LinkedListInsertion.printAllNodes(sum);
		System.out.println("Rotate the sum by 2");
		sum=rotateClockWiseLinkedList(sum, 2);
		LinkedListInsertion.printAllNodes(sum);
		//head=reverseLinkedListInGroups(head, 3);
	}
	
	public static Node reverseLinkedListInGroups(Node head, int size){
		if(head==null)
			return null;
		int count=0;
		Node nhead=head;
		Node prev=null;
		Node temp=head;
		while(temp!=null && count!=size){
			Node temp1=temp.next;
			temp.next=prev;
			prev=temp;
			temp=temp1;
			count++;
		}

		nhead.next=reverseLinkedListInGroups(temp, size);
		
		return prev;
	}
	
	
	public static boolean isLoopLinkedList(Node head){
		
		Node temp=head;
		Node temp1=head;
		while(temp!=null && temp1!=null && temp1.next!=null){
			if(temp==temp1)
				return true;
			
			temp=temp.next;
			temp1=temp1.next.next;
		}
		
		return false;
	}
	
	public static Node removeLoopFromLinkedList(Node head){
			
	      Hashtable h = new Hashtable();
	      Node temp=head;
	      Node prev=null;
	      while(temp!=null && h.get(temp.next)==null){
	       h.put(temp.next, temp.data);
	       prev=temp;
	       temp=temp.next;
	      }
	      temp.next=null;
	      
		return head;
	}

	//Adding two numbers given as a linked lists 
	public static Node addTwoLinkedLists(Node n1, Node n2){
		Node sum=null;
		n1=linkedlistSwapAndReversal.reverseLinkedList(n1);
		n2=linkedlistSwapAndReversal.reverseLinkedList(n2);
		int n=0;
		while(n1!=null&& n2!=null){
			int value=n1.data+n2.data+n;
			n=(value/10);
			value=value%10;
			sum=LinkedListInsertion.insertEnd(sum, value);
			n1=n1.next;
			n2=n2.next;
		}
		
		if(n1==null){
			while(n2!=null){
				sum=LinkedListInsertion.insertEnd(sum, (n2.data+n)%10);
				n=(n2.data+n)/10;
				n2=n2.next;
			}
		}else if(n2==null){
			while(n1!=null){
				sum=LinkedListInsertion.insertEnd(sum, (n1.data+n)%10);
				n=(n1.data+n)/10;
				n1=n1.next;
			}
		}
		//sum=LinkedListInsertion.insertEnd(sum, value);
		
		sum=linkedlistSwapAndReversal.reverseLinkedList(sum);
		
		return sum;
	}

	public static Node rotateClockWiseLinkedList(Node head, int index){
			
		if(head==null)
			return head;
		
		int length=lengthOfLinkedList(head);
			index=index%length;
		int count=0;
		Node cur=head;
		Node ahead=head;
		
		while(count!=index){
				ahead=ahead.next;
				count++;
			}
		
		while(ahead.next!=null){
			cur=cur.next;
			ahead=ahead.next;
		}
		ahead.next=head;
		head=cur.next;
		cur.next=null;
			
		
		
		return head;
	}
	
	public static int lengthOfLinkedList(Node head){
		int count=0;
		while(head!=null){
			count++;
			head=head.next;
		}
		return count;
	}

}
