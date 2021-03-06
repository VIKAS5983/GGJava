package gg.binaryTree;

public class TreeNodeDiameter {

		public static void main(String args[]){
			TreeNode head=TreeNodeInsertion.insertNode(null,1);
			head.left=new TreeNode(2);
			head.right=new TreeNode(3);
			head.left.left=new TreeNode(4);
			head.left.right=new TreeNode(5);
			System.out.print("Iterative: ");
			maxDiameter(head);
			System.out.println(maxD);
		}

		static int maxD=0;
		public static int maxDiameter(TreeNode head){
			
			if(head==null)
				return 0;
			
			int left=maxDiameter(head.left);
			int right=maxDiameter(head.right);
			int maxHeight=0;
			if(left>right){
				maxHeight=left;
			}else{
				maxHeight=right;
			}

			if(maxD<(left+right+1))
				maxD=left+right+1;
			
			return maxHeight+1;
		}
	}
