package gg.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNodeDFS {
	public static void main(String args[]){
		TreeNode head=TreeNodeInsertion.insertNode(null,1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		head.left.left=new TreeNode(4);
		head.left.right=new TreeNode(5);
		System.out.print("Iterative: ");
		iterativeDfs(head);
		System.out.print("\n Recursive:");
		recursiveDfs(head);
		
	}
	
	public static void iterativeDfs(TreeNode head){
		
		Stack<TreeNode> st=new Stack<TreeNode>();
		st.push(head);
		TreeNode temp=st.peek();

		while(!st.isEmpty()){
			
			
			temp=st.pop();
			System.out.print(temp.data+" ");
			
			if(temp.right!=null)
				{st.push(temp.right);}
				
			
			if(temp.left!=null)
				{
				 st.push(temp.left);
				}
			
		}		
	}
		

	
	public static void recursiveDfs(TreeNode head){
		if(head==null)
			return;
		System.out.print(head.data+ " ");

		recursiveDfs(head.left);
		recursiveDfs(head.right);

		
	}
	}

