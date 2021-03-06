package gg.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeBFS {

	public static void main(String args[]){
		TreeNode head=TreeNodeInsertion.insertNode(null,1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		head.left.left=new TreeNode(4);
		head.left.right=new TreeNode(5);
		System.out.print("Iterative: ");
		iterativeBfs(head);
		System.out.print("\n Recursive:");
		recursiveBfs(head);
		
	}
	
	public static void iterativeBfs(TreeNode head){
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		if(head!=null)
			q.add(head);
		
		while(!q.isEmpty()){
			TreeNode temp=q.poll();
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
			System.out.print(" "+ temp.data);
		}
		
	}
	
	public static void recursiveBfs(TreeNode head){
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		if(head!=null)
		q.add(head);
		recursiveBfsUtil(q);
		System.out.println();
	}

	private static void recursiveBfsUtil(Queue<TreeNode> q) {
		if(q.isEmpty())
			return;
		TreeNode temp= q.poll();
		System.out.print(" "+temp.data);
		if(temp.left!=null)
		q.add(temp.left);
		
		if(temp.right!=null)
		q.add(temp.right);
		
		recursiveBfsUtil(q);
	}
	
	
}
