package gg.binaryTree;

import java.util.Stack;

class Node{
	public Node(char data){
		this.data=data;
	}
	char data;
	Node left;
	Node right;
}

public class ExpressionTree {
	
    public static void main(String args[]) { 	  
        ExpressionTree et = new ExpressionTree(); 
        String postfix = "54+12*+"; 
        char[] charArray = postfix.toCharArray(); 
        Node root = et.constructTree(charArray); 
        System.out.println("infix expression is"); 
        inorder(root); 
        System.out.println();
        System.out.println("Value is "+ evaluateTree(root));
    } 
    
    public static void inorder(Node head){
    	if(head==null)
    		return;
    	
    	inorder(head.left);
    	System.out.print(head.data+" ");
    	inorder(head.right);
    }
    
    public Node constructTree(char[] charArray){
    	
    	Stack<Node> st=new Stack<Node>();
    	
    	for(int i=0;i<charArray.length;i++)
    	{
    		if(isOperand(charArray[i])){
    		
    			Node right=st.pop();
    			Node left=st.pop();
    			Node n=new Node(charArray[i]);
    			n.left=left;
    			n.right=right;
    			st.push(n);
    		}else
    			st.push(new Node(charArray[i]));
    		
    	}
    	return st.pop();
    }
    public static boolean isOperand(char ele){
    	
    		if(Character.isAlphabetic(ele)|| Character.isDigit(ele))
    			return false;
    	
    		return true;
    }
    
    public static int evaluateTree(Node head){
    	int leftValue,rightValue;
    	if(!Character.isDigit(head.left.data)){
    		leftValue=evaluateTree(head.left);
    	}else{
    		leftValue=head.left.data-'0';
    	}

    	if(!Character.isDigit(head.right.data)){
    		rightValue=evaluateTree(head.right);
    	}else{
    		rightValue=head.right.data-'0';
    	}
    	
    	int com=(int) ComputeValue(head.data, leftValue, rightValue);
    	    	
    	return com;
    }

    public static int ComputeValue(char sym,int left,int right){
    	
    	if(sym=='+'){
    		return left+right;
    	}else if(sym=='-'){
    		return left-right;
    	}else if(sym=='*'){
    		return left*right;
    	}else if(sym=='/'){
    		return left/right;
    	}
    	
    	return -1;
    }
}
