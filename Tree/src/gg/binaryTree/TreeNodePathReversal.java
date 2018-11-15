package gg.binaryTree;

import java.util.HashMap;
import java.util.Map;

public class TreeNodePathReversal {

		public static void main(String args[]){
			TreeNode head=TreeNodeInsertion.insertNode(null,7);
			head.left=new TreeNode(6);
			head.right=new TreeNode(5);
			head.left.left=new TreeNode(4);
			head.left.right=new TreeNode(3);
			head.right.left=new TreeNode(2);
			head.right.right=new TreeNode(1);

			System.out.print("Iterative: ");
			TreeNodeTraversel.inOrderTraversalIterator(head);

			reversePath(head,4);
			System.out.println();
			System.out.print("Iterative: \n( After reverseAfterPath): ");
			
			TreeNodeTraversel.inOrderTraversalIterator(head);
			
		}
		
		public static void reversePath(TreeNode head,int data){
			reversePathUtil(head, 0, data);
			
			return ;
		}
		
		static Map<Integer, Integer> mp=new HashMap<Integer,Integer>();
		
		public static int reversePathUtil(TreeNode head, int level,int data){
			if(head==null){
				return -1;
			}

			mp.put(level, head.data);

			if(head.data==data){
				head.data=mp.get(0);
				return level;
			}
			
			int fLevel=reversePathUtil(head.left,level+1,data);
			if(fLevel==-1)
			 fLevel=reversePathUtil(head.right,level+1,data);

			if(fLevel!=-1){
				head.data=mp.get(fLevel-level);
				return fLevel;
			}
			
			return -1;
		}

}