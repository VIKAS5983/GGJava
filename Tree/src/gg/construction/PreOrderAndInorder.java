package gg.construction;

import java.util.Vector;

import gg.binaryTree.TreeNode;
import gg.binaryTree.TreeNodeTraversel;

public class PreOrderAndInorder {

	public static void main(String args[]){
		int[] pre={1,2,4,7,5,8,9,3,6};
		int[] in={7,4,2,8,5,9,1,3,6};

        TreeNode root = buildTree(in, pre, 0, in.length - 1); 		
		TreeNodeTraversel.inOrderTraversol(root);	

	}
	
		
    static int preIndex = 0; 

    static TreeNode buildTree(int in[], int pre[], int inStrt, int inEnd) 
    { 
        if (inStrt > inEnd) 
            return null; 
  
        /* Pick current node from Preorder traversal using preIndex 
           and increment preIndex */
      //  System.out.println("isStr: inEnd "+inStrt +" : "+inEnd);
        TreeNode tNode = new TreeNode(pre[preIndex++]); 
  
        /* If this node has no children then return */
        if (inStrt == inEnd) 
            return tNode; 
  
        /* Else find the index of this node in Inorder traversal */
        int inIndex = search(in, inStrt, inEnd, tNode.data); 
  
        /* Using index in Inorder traversal, construct left and 
           right subtress */
        tNode.left = buildTree(in, pre, inStrt, inIndex - 1); 
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd); 
  
        return tNode; 
    } 

    public static int search(int[] in,int s,int e,int searchValue){
		int i;
		for(i=s;i<=e;i++){
			if(in[i]==searchValue)
				return i;
		}
		
		return i;
	}
	
	
}
