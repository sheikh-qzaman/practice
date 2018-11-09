package com.sheikh;

public class BinaryTreeNode<T> {
	private T data = null;
	private BinaryTreeNode<T> parent = null;
	private BinaryTreeNode<T> leftNode = null;
	private BinaryTreeNode<T> rightNode = null;
	private boolean visited = false;

	public BinaryTreeNode() {

	}

	public BinaryTreeNode(T data) {
		this.data = data;
	}

	public void setParent(BinaryTreeNode<T> parent) {
		this.parent = parent;
	}

	public void setLeftNode(BinaryTreeNode<T> node) {
		this.leftNode = node;
		if(node != null) {
			node.setParent(this);
		}
	}

	public BinaryTreeNode<T> getLeftNode() {
		return this.leftNode;
	}

	public void setRightNode(BinaryTreeNode<T> node) {
		this.rightNode = node;
		if(node != null) {
			node.setParent(this);
		}
	}

	public BinaryTreeNode<T> getRightNode() {
		return this.rightNode;
	}

	public void setVisited(BinaryTreeNode<T> node, int level) {
		node.visited = true;
		System.out.println(node.data.toString() + "	" + level);
	}

	public void setVisited(BinaryTreeNode<T> node) {
		node.visited = true;
		System.out.println(node.data.toString());
	}

	public void inOrderTraverse(BinaryTreeNode<T> root, int level) {
		if(root == null) {
			return;
		}

		this.inOrderTraverse(root.getLeftNode(), level + 1);
		this.setVisited(root, level);
		this.inOrderTraverse(root.getRightNode(), level + 1);
	}

	public void inOrderTraverse(BinaryTreeNode<T> root) {
		if(root == null) {
			return;
		}

		this.inOrderTraverse(root.getLeftNode());
		this.setVisited(root);
		this.inOrderTraverse(root.getRightNode());
	}

	public void preOrderTraverse(BinaryTreeNode<T> root) {
		if(root == null) {
			return;
		}

		this.setVisited(root);
		this.preOrderTraverse(root.getLeftNode());
		this.preOrderTraverse(root.getRightNode());
	}

	public void postOrderTraverse(BinaryTreeNode<T> root) {
		if(root == null) {
			return;
		}

		this.postOrderTraverse(root.getLeftNode());
		this.postOrderTraverse(root.getRightNode());
		this.setVisited(root);
	}

	public void insert(T data) {

	}
}
