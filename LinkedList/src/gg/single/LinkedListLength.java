package gg.single;


public class LinkedListLength {

	public static void main(String args[]){
		Node head=new Node(1);
			head.next=new Node(2);
		int count=findLengthIterative(head);
		int count2=findLengthRecursive(head);
		
		System.out.println(count);
		System.out.println(count2);
	}
	
	
	public static int findLengthIterative(Node head){
		int count=0;
		while(head!=null){
			head=head.next;
			count++;
		}
		return count;
	}
	
	public static int findLengthRecursive(Node head){
		if(head==null)
			return 0;
		
		return 1+findLengthRecursive(head.next);
	}
	
}
