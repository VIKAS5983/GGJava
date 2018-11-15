package gg.binaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

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
		
		System.out.println("Inorder Traversal WithoutRecrusion ");
		
		inOrderTraversalIterator(head);
        TreeNode root = new TreeNode(8); 
        root.left = new TreeNode(3); 
        root.right = new TreeNode(10); 
        root.left.left = new TreeNode(1); 
        root.left.right = new TreeNode(6); 
        root.right.right = new TreeNode(14); 
        root.right.right.left = new TreeNode(13); 
        root.left.right.left = new TreeNode(4); 
        root.left.right.right = new TreeNode(7); 

		diagonalTraversal(root);
		return;
	}

	public static void inOrderTraversol(TreeNode head){
		if(head==null)
			return; 
		
		inOrderTraversol(head.left);
		
		System.out.print(head.data+  "-> ");
		inOrderTraversol(head.right);
		
	}
	
	public static void inOrderTraversalIterator(TreeNode head){
		
		Stack<TreeNode> st=new Stack<TreeNode>();
		

	       TreeNode curr = head; 
	       
	        // traverse the tree 
	        while (curr != null || st.size() > 0) 
	        { 
	  
	            /* Reach the left most Node of the 
	            curr Node */
	            while (curr !=  null) 
	            { 
	                /* place pointer to a tree node on 
	                   the stack before traversing 
	                  the node's left subtree */
	                st.push(curr); 
	                curr = curr.left; 
	            } 
	  
	            /* Current must be NULL at this point */
	            curr = st.pop(); 
	  
	            System.out.print(curr.data + " "); 
	  
	            /* we have visited the node and its 
	               left subtree.  Now, it's right 
	               subtree's turn */
	            curr = curr.right; 
	        } 		
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

	public static void diagonalTraversal(TreeNode head){
		Map<Integer,Vector<TreeNode>> mp=new HashMap<Integer, Vector<TreeNode>>();
		int diagonalOrder=1;
		diagonalTraversalUtil(head, mp,diagonalOrder);
		System.out.println("Diagonal Order as follows ");
		 for(Map.Entry<Integer, Vector<TreeNode>> en:mp.entrySet()){
			 System.out.print(en.getKey()+" : -> ");
			 
			 for(int i=0; i<en.getValue().size(); i++){
				 System.out.print(en.getValue().get(i).data+" ");
			 }
			 System.out.println();
		 }
	}
	
	public static void diagonalTraversalUtil(TreeNode head,Map<Integer,Vector<TreeNode>> mp,int dO){
		if(head==null){
			return;
		}
		if(mp.get(dO)==null){
			Vector<TreeNode> v=new Vector<TreeNode>();
			v.add(head);
			 mp.put(dO, v);
		}else
		mp.get(dO).add(head);
		
		diagonalTraversalUtil(head.left, mp, dO+1);
		diagonalTraversalUtil(head.right,mp,dO);
		
	}
}
