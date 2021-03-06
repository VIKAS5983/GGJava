package gg.binaryTree;

public class TreeNodesFoldable {
	public static void main(String args[]){
		
		TreeNode head=TreeNodeInsertion.insertNode(null,1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		head.left.left=new TreeNode(4);
		head.left.right=new TreeNode(5);

		TreeNode head1=TreeNodeInsertion.insertNode(null,1);
		head1.left=new TreeNode(2);
		head1.right=new TreeNode(3);
		head1.left.left=new TreeNode(4);
		head1.left.right=new TreeNode(5);

		System.out.println("InorderTraversal ");
		TreeNodeTraversel.inOrderTraversol(head);
		System.out.println("InorderTraversal ");
		boolean isFoldable=isTreesFoldable(head);

		System.out.println("isFoldable "+ isFoldable);
		
		return;
	}

	public static boolean isTreesFoldable(TreeNode n1){
		if(n1==null)
			return true;
		
		return false;
	}
	
public static boolean isTreesFoldableUtils(TreeNode n1, TreeNode n2){
	if(n1==null && n2==null)
		return true;
	
	if(n1==null|| n2==null)
		return false;
			
	return isTreesEqual(n1.left, n2.right);
}
	
	public static TreeNode getMirrorImage(TreeNode head){
		if(head==null)
			return null;
		TreeNode temp=head.left;
		head.left=getMirrorImage(head.right);
		head.right=getMirrorImage(temp);
		
		return head;
	}
	
	public static boolean isTreesEqual(TreeNode n1,TreeNode n2){
		if(n1==null&&n2==null)
			return true;
		
		if(n1==null||n2==null)
			return false;
	
		if(n1.data==n2.data)
			return isTreesEqual(n1.left, n2.left) && isTreesEqual(n1.right, n2.right);
		else
			return false;
	}
}
