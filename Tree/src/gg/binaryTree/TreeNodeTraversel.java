package gg.binaryTree;

public class TreeNodeTraversel {
	
	
	public static void main(String args[]){
		
		TreeNode head=TreeNodeInsertion.insertNode(null,1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		head.left.left=new TreeNode(4);
		head.left.right=new TreeNode(5);

		System.out.println("InorderTraversal ");
		inOrderTraversol(head);

		System.out.println("\n Pre OrderTraversal ");
		preOrderTraversol(head);

		System.out.println("\n Post orderTraversal ");
		postOrderTraversol(head);
		
		return;
	}

	public static void inOrderTraversol(TreeNode head){
		if(head==null)
			return; 
		
		inOrderTraversol(head.left);
		
		System.out.print(head.data+  "-> ");
		inOrderTraversol(head.right);
		
	}
	public static void preOrderTraversol(TreeNode head){
		
		if(head==null)
			return;
		
		System.out.print(head.data+"-> ");
		
		preOrderTraversol(head.left);
		preOrderTraversol(head.right);
		return;
	}
	
	public static void postOrderTraversol(TreeNode head){
		
		if(head==null)
			return;		
		postOrderTraversol(head.left);
		postOrderTraversol(head.right);
		System.out.print(head.data+"-> ");

		
		return;
		
	}

}