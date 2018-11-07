package gg.binaryTree;

public class TreeNodeLevelOrder {

	public static void main(String args[]){
		TreeNode head=TreeNodeInsertion.insertNode(null,1);
		head.left=new TreeNode(2);
		head.right=new TreeNode(3);
		head.left.left=new TreeNode(4);
		head.left.right=new TreeNode(5);
		System.out.print("Iterative: ");
		iterativeLevelOrderTraversal(head);
		System.out.print("\n Recursive:");
		recursiveLevelOrderTraversal(head);
		
	}
	
	public static void iterativeLevelOrderTraversal(TreeNode head){
		//Same as BreadthFirstTraversal 
	
	}
	static int maxLevel=0;
	public static void recursiveLevelOrderTraversal(TreeNode head){
		findMaxLevelMethod(head, 0);
		
		System.out.println("MaxLevel is "+ maxLevel);
		for(int i=1;i<=maxLevel;i++){
			recursiveUtilLevelOrderTraversal(head, i);
			System.out.println();
		}
	}
	
	public static void findMaxLevelMethod(TreeNode head,int level){
		if(head==null){
			return;
		}
			level++;
		

		if(maxLevel<level){
			maxLevel=level;
		}

		findMaxLevelMethod(head.left, level);
		
		findMaxLevelMethod(head.right, level);
	}

	public static void recursiveUtilLevelOrderTraversal(TreeNode head,int level){
		if(head==null){
			return;
		}
		level--;
		if(level==0)
		System.out.print(head.data+" ");
		
		recursiveUtilLevelOrderTraversal(head.left, level);

		recursiveUtilLevelOrderTraversal(head.right, level);

	}
}
