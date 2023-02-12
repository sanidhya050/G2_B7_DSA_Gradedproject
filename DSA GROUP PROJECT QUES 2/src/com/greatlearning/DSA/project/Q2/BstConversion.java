package com.greatlearning.DSA.project.Q2;

public class BstConversion {
	
	Node node ;
	Node prev = null;
	Node newHead = null;
	
  void bstToRightSkew(Node root )
	{
		if(root == null )
			return;
		
		bstToRightSkew(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(newHead == null)
	{
			newHead = root;
			root.left = null;
			prev = root;
	    }
		else
		{
			prev.right = root;
			root.left = null;
			prev = root;
		}
		
		bstToRightSkew(rightNode);
	}
	
  void traverseRightSkewTree(Node root )
	{
		if(root == null )
			return;
		System.out.print(root.val + " ");
		
		traverseRightSkewTree(root.right);
	}

}
