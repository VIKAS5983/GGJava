package gg.doubly;

public class doubleLinkedListQuickSort {
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
	}

	public static Node quickSort(Node head){
		
	
		return null;
	}
	
}
