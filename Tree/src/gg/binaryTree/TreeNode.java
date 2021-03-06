package gg.binaryTree;

public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data){
		this.data=data;
	}
	
	public static void printTreeNode(TreeNode head){
		
		System.out.print("TreeNode :");
		printNode(head);
		System.out.println();
	}
	
	private static void printNode(TreeNode  temp){
		if(temp==null)
			return ;
		
		printNode(temp.left);
		
		System.out.print(temp.data+ " ");
		printNode(temp.right);
	}
	
}
