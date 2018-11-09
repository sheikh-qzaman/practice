package com.sheikh;

public class LinkedList {
	public Node head;
	
	public LinkedList() {
		Node node = new Node(-1);
		this.head = node;
	}

	public Node addAtBack(int data){
		Node runner = head;
		while(runner.getNext() != null) {
			runner.setNext(runner.getNext());
		}
		Node newNode = new Node(data);
		runner.setNext(newNode);
		return head;
	}
	public Node addAtFront(int data) {
		Node node = new Node(data);
		node.setNext(head.next);
		this.head = node;
		return head;
	}
	public class Node {
		private Node next;
		private int data;
		
		public Node(int data){ 
			this.data = data;
		}
		public int getData() {
			return this.data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return this.next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
