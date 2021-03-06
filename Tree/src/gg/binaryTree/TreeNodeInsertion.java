package gg.binaryTree;

public class TreeNodeInsertion {
	
	public static TreeNode insertNode(TreeNode head,int data){
		if(head==null){
			return new TreeNode(data);
		}
		if(head.data<data){
			head.right=insertNode(head.right, data);
		}else if(head.data>data){
			head.left=insertNode(head.left,data);
		}
		return head;
	}
}
