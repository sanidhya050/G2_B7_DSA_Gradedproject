package com.greatlearning.DSA.project.Q2;

public class Driver {
	
	 public static void main(String[] args){

	     BstConversion tree = new  BstConversion();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left  = new Node (10);
	     tree.node.right.left= new Node (55);
	     
	     tree.bstToRightSkew(tree.node);
	     
	     System.out.println("Right Skew Tree Obtained is :  \n");
	     
	     tree.traverseRightSkewTree(tree.newHead);

   }
}	 
	 
