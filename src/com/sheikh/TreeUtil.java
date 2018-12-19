package com.sheikh;
import com.sheikh.BinaryTreeNode;

import java.util.*;
import java.util.LinkedList;

public class TreeUtil {
	public TreeUtil() {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		BinaryTreeNode<Integer> myTree = this.createBST(arr);
		//myTree.inOrderTraverse(myTree, 0);
		//myTree.inOrderTraverse(myTree);
		//myTree.postOrderTraverse(myTree);
		//this.treeTest();

		ArrayList<java.util.LinkedList<BinaryTreeNode<Integer>>> list =
				new ArrayList<LinkedList<BinaryTreeNode<Integer>>>();
		for(int i = 0; i < 5; i++) {
			list.add(i, new LinkedList<BinaryTreeNode<Integer>>());
		}
		createLinkedListPerLevel(myTree, list, 0);
	}

	public static TreeNode createTree(int[] tree, int i) {
		TreeNode node = null;
		if (i >= tree.length) return null;
		else if (tree[i] == -1) return null;
		else {
			node = new TreeNode(tree[i]);
			node.left = createTree(tree, 2 * i + 1);
			node.right = createTree(tree, 2 * i + 2);
		}
		return node;
	}

	public static TreeLinkNode createTreeLink(int[] tree, int i) {
		TreeLinkNode node = null;
		if (i >= tree.length) return null;
		else if (tree[i] == -1) return null;
		else {
			node = new TreeLinkNode(tree[i]);
			node.left = createTreeLink(tree, 2 * i + 1);
			node.right = createTreeLink(tree, 2 * i + 2);
		}
		return node;
	}

	public void insertItem(BinaryTreeNode<Integer> node,
						   ArrayList<LinkedList<BinaryTreeNode<Integer>>> list, int level) {
		try {
			list.get(level);
		} catch (Exception e) {
			list.add(level, new LinkedList<BinaryTreeNode<Integer>>());
		}
		list.get(level).add(node);
	}

	public void createLinkedListPerLevel(BinaryTreeNode<Integer> root,
										 ArrayList<java.util.LinkedList<BinaryTreeNode<Integer>>> list, int level) {
		if(root == null) {return;}
		createLinkedListPerLevel(root.getLeftNode(), list, level + 1);
		insertItem(root, list, level);
		createLinkedListPerLevel(root.getRightNode(), list, level + 1);

	}

	public void treeTest() {
		BinaryTreeNode<Integer> parent = new BinaryTreeNode<Integer>(10);
		BinaryTreeNode<Integer> child1 = new BinaryTreeNode<Integer>(8);
		BinaryTreeNode<Integer> child2 = new BinaryTreeNode<Integer>(16);

		parent.setLeftNode(child1);
		parent.setRightNode(child2);

		BinaryTreeNode<Integer> child11 = new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> child12 = new BinaryTreeNode<Integer>(9);

		child1.setLeftNode(child11);
		child1.setRightNode(child12);

		BinaryTreeNode<Integer> child21 = new BinaryTreeNode<Integer>(14);
		BinaryTreeNode<Integer> child22 = new BinaryTreeNode<Integer>(20);

		child2.setLeftNode(child21);
		child2.setRightNode(child22);

		parent.inOrderTraverse(parent, 0);
	}
	
	public BinaryTreeNode<Integer> createBST(int arr[]) {
		return createBST(arr, 0, arr.length - 1);
	}
	
	public BinaryTreeNode<Integer> createBST(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}

		int mid = (start + end) / 2;
		BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[mid]);
		node.setLeftNode(createBST(arr, start, mid - 1));
		node.setRightNode(createBST(arr, mid + 1, end));
		return node;
	}
	public static void main(String[] args) {
		new TreeUtil();
	}
}
